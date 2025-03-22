package com.example.lab3_zadanie1;

import com.example.lab3_zadanie1.model.Products;
import com.example.lab3_zadanie1.repository.ProductsRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab3Zadanie1Application {

    private final ProductsRepository productsRepository;

    public Lab3Zadanie1Application(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public static void main(String[] args) {

        var context = SpringApplication.run(Lab3Zadanie1Application.class, args);
        // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        // ^ "instances of classes with some configuration metadata around it" (more in documentation)
    }

    @Bean
    @Transactional
    public CommandLineRunner run(ProductsRepository repository){
        return args -> {
            insertNewProducts();
            System.out.println(("Products: " + productsRepository.findAll()));
        };
    }


    private void insertNewProducts() {
        if (productsRepository.count() == 0) {
            productsRepository.save(new Products( "Product1", 12.45));
            productsRepository.save(new Products( "Product2", 6.10));
            productsRepository.save(new Products( "Product3", 8.25));
        }
    }


}