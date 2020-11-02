package com.example.demo.sevice;

import com.example.demo.dto.request.Groups;
import com.example.demo.dto.response.AllUser;

public interface ContentSevice {
    AllUser getAllUser(int pageSize,int pageNumber);
    String createGroup(Groups groups);
}
