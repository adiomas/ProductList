package com.example.productList.service;

import com.example.productList.model.Consumer;
import com.example.productList.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerService {

    @Autowired
    private ConsumerRepository consumerRepository;

    public List<Consumer> listAll() {
        return consumerRepository.findAll();
    }

    public void save(Consumer consumer) {
        consumerRepository.save(consumer);
    }

    public Consumer get(Long id) {
        return consumerRepository.findById(id).get();
    }

    public void delete(Long id){
        consumerRepository.deleteById(id);

    }
}
    