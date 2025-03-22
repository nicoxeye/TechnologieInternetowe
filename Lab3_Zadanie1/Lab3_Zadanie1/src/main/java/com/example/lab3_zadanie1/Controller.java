package com.example.lab3_zadanie1;

import com.example.lab3_zadanie1.model.Products;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.lab3_zadanie1.repository.ProductsRepository;
import java.util.List;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    private final ProductsRepository productsRepository;

    public Controller(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello World :D:D";
    }

    @GetMapping("/products")
    public List<Products> getProducts() {
        return productsRepository.findAll();
    }

}