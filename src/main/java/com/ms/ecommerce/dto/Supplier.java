package com.ms.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supplier {
    private int SupplierId;
    private String SupplierName;
    private String ContactName;
    private String ContactEmail;
    private int ContactPhone;

}
