package com.ms.ecommerce.service;

import com.ms.ecommerce.dto.Supplier;
import com.ms.ecommerce.repository.SupplierRepository;
import com.ms.ecommerce.repository.SupplierRepositoryImpl;

public class SupplierServiceImpl implements SupplierService {
    private SupplierRepository supplierRepository= SupplierRepositoryImpl.getInstance();
    private  SupplierServiceImpl(){}
    private static SupplierServiceImpl supplierService;
    public static SupplierServiceImpl getInstance(){
        if(supplierService==null){
//            System.out.println("inside if");
            supplierService=new SupplierServiceImpl();
            return supplierService;
        }
        return supplierService;
    }

    @Override
    public Supplier addSupplier(Supplier supplier) {
        return supplierRepository.addSupplier(supplier);
    }

    @Override
    public Supplier[] getAllSupplier() {
        return supplierRepository.getAllSupplier();
    }

    @Override
    public Supplier getSupplierById(int id) {
        return supplierRepository.getSupplierById(id);
    }

    @Override
    public String deleteSupplierById(int id) {
        return supplierRepository.deleteSupplierById(id);
    }

    @Override
    public Supplier updateSupplierById(int id, Supplier supplier) {
        return supplierRepository.updateSupplierById(id,supplier);
    }
}
