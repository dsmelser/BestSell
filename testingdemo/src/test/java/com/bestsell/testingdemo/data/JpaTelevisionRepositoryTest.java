package com.bestsell.testingdemo.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JpaTelevisionRepositoryTest {

    @Autowired
    JpaTelevisionRepository jpaTelevisionRepository;

    @Test
    void findByModelPartial() {

        var results = jpaTelevisionRepository.findByModelPartial("Ultra");

        assertEquals(1, results.size());

//        var results2 = jpaTelevisionRepository.findAll();

    }
}