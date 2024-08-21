package com.ms.ecommerce.repository;

import com.ms.ecommerce.dto.Supplier;

import java.util.ArrayList;

public class SupplierRepositoryImpl implements SupplierRepository{
    private ArrayList<Supplier> supplierList=new ArrayList<>();
    private SupplierRepositoryImpl() {
    }
    private static SupplierRepositoryImpl supplierRepository;

    public static SupplierRepositoryImpl getInstance() {
        if (supplierRepository == null) {
            supplierRepository = new SupplierRepositoryImpl();
            return supplierRepository;
        }
        return supplierRepository;
    }

    @Override
    public Supplier addSupplier(Supplier supplier) {
        Supplier supplier1=null;
        if(supplierList.add(supplier)) {
            supplier1=supplier;
        }
        return supplier1;
    }

    @Override
    public Supplier[] getAllSupplier() {
        Supplier[] array= supplierList.toArray(new Supplier[supplierList.size()]);
        return array;
    }

    @Override
    public Supplier getSupplierById(int id) {
        for (Supplier supplier : supplierList) {
            if(supplier.getSupplierId()==id) return supplier;
        }
        return null;
    }

    @Override
    public String deleteSupplierById(int id) {
        Supplier supplier=this.getSupplierById(id);
        if(supplier!=null){
            return (supplierList.remove(getSupplierById(id)) )?  "success" :  "fail";
        }

        return "not found";
    }

    @Override
    public Supplier updateSupplierById(int id, Supplier supplier) {
        if(this.deleteSupplierById(id).equals("success")) {
            if (this.addSupplier(supplier) != null) return supplier;
        }
        return null;
    }
}