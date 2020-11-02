package com.example.demo.controller;
import com.example.demo.dto.request.Groups;
import com.example.demo.dto.response.AllUser;
import com.example.demo.sevice.ContentSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpringRestClient {
    @Autowired
    private ContentSevice contentSevice;
    @GetMapping("/getAllUser")
    public AllUser getAllUser(@RequestParam(name = "pageSize",defaultValue = "1") int pageSize,
                              @RequestParam(name = "pageNumber",defaultValue = "1") int pageNumber){
        AllUser allUser= contentSevice.getAllUser(pageSize,pageNumber);
        return allUser;
    }
    @PostMapping(
           path = "/createGroup")
    public ResponseEntity<String> addGroup(@RequestBody Groups groups){
        String rs = contentSevice.createGroup(groups);
        return new ResponseEntity<>(rs, HttpStatus.OK);
    }
}
