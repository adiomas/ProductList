package com.example.productList.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
@EntityListeners(AuditingEntityListener.class)
public class Product extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "price")
    private double price;

    @ManyToMany(mappedBy = "purchasedProducts")
    private List<Purchase> products;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Purchase> getProducts() {
        return products;
    }

    public void setProducts(List<Purchase> products) {
        this.products = products;
    }
}
