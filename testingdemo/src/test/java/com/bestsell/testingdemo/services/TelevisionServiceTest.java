package com.bestsell.testingdemo.services;

import com.bestsell.testingdemo.data.JpaTelevisionRepository;
import com.bestsell.testingdemo.models.Television;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class TelevisionServiceTest {

    @Mock
    JpaTelevisionRepository jpaTelevisionRepository;

    @InjectMocks
    private TelevisionService televisionService;


//
//    public Television( int id, String brand, String model, String color, int year ){
//        this.id = id;
//        this.brand = brand;
//        this.model = model;
//        this.color = color;
//        this.year = year;
//    }

    @BeforeEach
    void setUp() {
        when(jpaTelevisionRepository.findAll())
                .thenReturn(List.of( new Television(5, "Sony", "mock-model", "mock", 2000 ) ));


    }

    @Test
    void addTelevision() {
    }

    @Test
    void removeTelevisionById() {
    }

    @Test
    void getAllTVs() {

        //without other configuration
        //this crosses the "unit" threshold
        //by actually accessing a database
        var result = televisionService.getAllTVs();


    }
}