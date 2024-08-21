package com.ms.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    private int reviewId;
    private int productId;
    private int customerId;
    private int rating;
    private String reviewText;
    private LocalDate reviewDate;
}
