package com.example.productList.service;

import com.example.productList.ProductListApplication;
import com.example.productList.model.Product;
import com.example.productList.repository.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProductListApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProductControllerIntegrationTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private ProductRepository repo;

    @Test
    public void getProduct() {
        Product bla =  new Product();
        bla.setId(1L);
        bla.setName("Brašno");
        bla.setPrice(10);

        repo.save(bla);
        var response = testRestTemplate.getForEntity("/",String.class);
        assertTrue(response.getBody().contains("Brašno"));
    }

}
