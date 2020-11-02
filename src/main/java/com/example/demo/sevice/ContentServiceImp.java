package com.example.demo.sevice;

import com.example.demo.dto.request.Groups;
import com.example.demo.dto.response.AllUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ContentServiceImp implements ContentSevice{
    private static final String GET_ALL_USER="api/3.9/sites/a244099e-52f1-460b-beed-95e37011e6b1/users/";
    private static final String CREATE_GROUP="api/3.9/sites/a244099e-52f1-460b-beed-95e37011e6b1/groups";
    @Autowired
    private WebClient webClient;

    @Override
    public AllUser getAllUser(int pageSize,int pageNumber) {
      return webClient.get().uri(uriBuilder ->
              uriBuilder.path(GET_ALL_USER).queryParam("pageSize",pageSize)
             .queryParam("pageNumber",pageNumber)
             .build()).header("X-Tableau-Auth","wvhpwxrlRoir_ciJ02vMYQ|RKcrbPsRxTEeG3vlPpETZoCDbql3GTBC")
              .retrieve().bodyToMono(AllUser.class).block();
    }

    @Override
    public String createGroup(Groups groups) {
        return webClient.post()
                .uri(CREATE_GROUP)
                .contentType(MediaType.valueOf(MediaType.APPLICATION_XML_VALUE))
                .body(groups, Groups.class)
                .header("X-Tableau-Auth","wvhpwxrlRoir_ciJ02vMYQ|RKcrbPsRxTEeG3vlPpETZoCDbql3GTBC")
                .retrieve().bodyToMono(String.class).block();
    }

}
