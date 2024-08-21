package com.ms.ecommerce.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private int orderId;
    private int customerId;
    @Getter
    @Setter(AccessLevel.NONE)
    private LocalDate orderDate;
}
