package com.ms.ecommerce.dto;

import lombok.Data;

@Data
public class Supplier {
    private int SupplierId;
    private String SupplierName;
    private String ContactName;
    private String ContactEmail;
    private int ContactPhone;

}
