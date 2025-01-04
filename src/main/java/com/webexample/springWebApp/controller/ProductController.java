package com.webexample.springWebApp.controller;

import com.webexample.springWebApp.model.Product;
import com.webexample.springWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    //@RequestMapping("/products")
    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProduct();
    }

   // @RequestMapping("/products/{prodID}")
   @GetMapping("/products/{prodID}")
    public Product getProductByID(@PathVariable int prodID){
     return  service.getProductByID(prodID);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod)
    {
        System.out.println(prod);
        service.addProduct(prod);
    }

    @PutMapping("/products/{prodID}")
    public void updateproduct(@RequestBody Product prod){
        System.out.println("here in update");
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodID}")
    public void deleteProduct(@PathVariable int prodID){
        service.deleteProduct(prodID);
    }
}
