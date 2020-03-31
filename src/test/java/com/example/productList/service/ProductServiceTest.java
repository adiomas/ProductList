package com.example.productList.service;

import com.example.productList.model.Product;
import com.example.productList.repository.ProductRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;


import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@RunWith(SpringRunner.class)
public class ProductServiceTest {

    private final Long id = 1L;
    private final List<Product> products = new ArrayList<>();
    @InjectMocks
    ProductService productService;
    @Mock
    private ProductRepository productRepository;
    private Product product;

    @Before
    public void setup() throws Exception {
        product = new Product();
        product.setId(id);
        products.add(product);
    }

    @Test
    public void getAllProducts_ifSizeOfProductsIsOne_returnProducts() throws FileNotFoundException {
        when(productRepository.findAll()).thenReturn(products);
        List<Product> prodList = productService.listAll();

        assertEquals(1, prodList.size());
        verify(productRepository, times(1)).findAll();
    }

    @Test
    public void saveProduct_IfProductIsSaved_NumberOfInvoShouldBeOne() {
        productService.save(product);
        verify(productRepository, times(1)).save(product);
    }

    @Test
    public void getProductById_ifProductWithIdExists_returnProduct() {
        Optional<Product> optionalEntityType = Optional.of(product);
        when(productRepository.findById(id)).thenReturn(optionalEntityType);
        Product found = productService.get(id);
        assertEquals(product.getId(), found.getId());

    }

    @Test
    public void deleteById_IfProductIsDeleted_SizeOfProductsShouldBeZero() {
        productService.delete(id);
        List<Product> prodList = productService.listAll();
        assertEquals(0, prodList.size());
    }

}