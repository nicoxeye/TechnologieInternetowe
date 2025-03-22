package com.example.lab3_zadanie1.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Entity
public class Products {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double price;

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

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Products() {

    }

    @Override
    public String toString() {
        return "Table{id=" + id + ", name=" + name + ", price=" + price + "}";
    }


}
