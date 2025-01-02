package com.webexample.springWebApp.model;
//import lombok.AllArgsConstructor;
//import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
    private  int prodID;
    private String prodName;
    private int price;

    public Product(){

    }

    public Product(@Value("${product.id:0}") int prodID,
                   @Value("${product.name:Default}")String prodName,
                   @Value("${product.id:0}")int price) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProdID() {
        return prodID;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
