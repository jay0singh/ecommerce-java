package com.ms.ecommerce.service;

import com.ms.ecommerce.dto.Supplier;

public interface SupplierService {
    public Supplier addSupplier(Supplier supplier);
    public Supplier[] getAllSupplier();
    public Supplier getSupplierById(int id);
    public String deleteSupplierById(int id);
    public Supplier updateSupplierById(int id,Supplier supplier);
}
