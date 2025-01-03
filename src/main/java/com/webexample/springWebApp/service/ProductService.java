package com.webexample.springWebApp.service;

import com.webexample.springWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"iPhone",60000),
            new Product(102,"Canon",70000)));
    public List<Product> getProduct(){
    return products;
    }

    public Product getProductByID(int prodID) {
        return products.stream()
                .filter(p -> p.getProdID() == prodID )
                .findFirst().orElse(new Product(100,"No Items in the List",0));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }
}
