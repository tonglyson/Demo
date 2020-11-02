package com.example.demo.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Pagination {
    private int pageNumber;

    private int pageSize;

    private int totalAvailable;

    @Override
    public String toString() {
        return "Pagination{" +
                "pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", totalAvalible=" + totalAvailable +
                '}';
    }
}
