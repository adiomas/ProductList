package com.example.productList.service;


import com.example.productList.model.Purchase;
import com.example.productList.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> listAll() {
        return purchaseRepository.findAll();
    }

    public void save(Purchase purchase) {
        purchaseRepository.save(purchase);
    }

    public Purchase get(Long id) {
        return purchaseRepository.findById(id).get();
    }

    public void delete(Long id){
        purchaseRepository.deleteById(id);
    }
}
