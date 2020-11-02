package com.example.demo.dto.response;

import lombok.Data;

@Data
public class AllUser {

    private Pagination pagination;

    private Users users;

    @Override
    public String toString() {
        return "AllUser{" +
                "pagination=" + pagination +
                ", user=" + users +
                '}';
    }

}
