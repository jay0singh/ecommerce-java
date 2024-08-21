package com.ms.ecommerce.repository;

import com.ms.ecommerce.dto.Customer;
import com.ms.ecommerce.dto.Supplier;

public interface SupplierRepository {
    public Supplier addSupplier(Supplier supplier);
    public Supplier[] getAllSupplier();
    public Supplier getSupplierById(int id);
    public String deleteSupplierById(int id);
    public Supplier updateSupplierById(int id,Supplier supplier);
}
