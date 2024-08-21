package com.ms.ecommerce.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Category {
    private int categoryId;
    private String categoryName;
}
