package com.example.productList.service;

import com.example.productList.model.Product;
import com.example.productList.repository.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceIntegrationTest {

    @Autowired
    private ProductRepository repo;

    @Test
    public void testWriteToDB_afterAppStart_shouldReturnProduct() throws Exception {
        Product prod = new Product();
        prod.setId(1L);
        prod.setName("Brašno");
        prod.setPrice(10);

        repo.save(prod);
        assertEquals(1,repo.findAll().size() );
    }

    @Test
    public void writeToDB_afterUpdate_shouldReturnNewValue() {
        Product prod = new Product();
        prod.setId(1L);
        prod.setName("Brašno");
        prod.setPrice(10);

        repo.save(prod);
        assertEquals(10, prod.getPrice());
        prod.setPrice(15);
        assertEquals(15,prod.getPrice());
    }

    @Test
    public void getProductById_ifProductWithIdExists_returnProduct() {
        Product prod = new Product();
        prod.setId(1L);
        prod.setName("Brašno");
        prod.setPrice(10);

        repo.save(prod);
        Product saved = repo.findById(1L).get();
        assertTrue(saved.getId().equals(prod.getId()));
    }

    @Test
    public void deleteById_IfProductIsDeleted_SizeOfShouldBeZero(){
        Product prod = new Product();
        prod.setId(1L);
        prod.setName("Brašno");
        prod.setPrice(10);

        repo.save(prod);
        assertEquals(1,repo.findAll().size() );

        repo.deleteById(1L);
        assertEquals(0,repo.findAll().size() );
    }

    @Test(expected = EmptyResultDataAccessException.class)
    public void deleteProductThatIsNotInDB_productThatisNotInDBCantBeDeleted(){
        repo.deleteById(2L);
    }






}
