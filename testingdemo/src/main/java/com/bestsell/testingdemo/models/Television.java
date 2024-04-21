package com.bestsell.testingdemo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.context.annotation.Primary;


@Entity
@Table(name = "televisions")
public class Television {

    public Television() {

    }

    public Television( int id, String brand, String model, String color, int year ){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Id
    private int id;

    private String brand;

    private String model;

    private String color;

    private int year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
