package com.example.productList.model;

import jdk.jfr.Enabled;

import javax.persistence.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name = "purchases")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "consumer_id")
    private Consumer consumer;

    @ManyToMany
    @JoinTable(name = "purchased_products", joinColumns = @JoinColumn(name = "purchase_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
    private Set<Product> purchasedProducts;

    public Purchase() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public Set<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(Set<Product> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }
}
