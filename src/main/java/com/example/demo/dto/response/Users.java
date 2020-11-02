package com.example.demo.dto.response;

import com.example.demo.dto.response.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Users {
    private List<User> user = new ArrayList<>();

    @Override
    public String toString() {
        return "Users{" +
                "user=" + user +
                '}';
    }
}
