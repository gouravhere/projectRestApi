package com.example.demo.controllers;

import com.example.demo.enteties.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    private ProductRepository repository;

    @RequestMapping(value = "/product/",method = RequestMethod.GET)
   public List<Product> getProducts(){
        return repository.findAll();
    }

    @RequestMapping(value = "/product/{id}",method = RequestMethod.GET)
    public Product getProduct(@PathVariable("id") int id){
        return repository.findById(id).get();
    }

    @RequestMapping(value = "/product/",method = RequestMethod.POST)
    public Product createProduct(@RequestBody Product product){
        return repository.save(product);
    }

    @RequestMapping(value = "/product/",method = RequestMethod.PUT)
    public Product updateProduct(@RequestBody Product product){
        return repository.save(product);
    }

    @RequestMapping(value = "/product/{id}",method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable("id") int id){
        repository.deleteById(id);
    }
    //learning
}
