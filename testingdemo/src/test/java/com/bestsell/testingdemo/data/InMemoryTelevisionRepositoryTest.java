package com.bestsell.testingdemo.data;

import com.bestsell.testingdemo.models.Television;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class InMemoryTelevisionRepositoryTest {

    //spring DI will automatically create this because we marked InMemoryTelevisionRepository as a @Component
    @Autowired
    InMemoryTelevisionRepository repo;

    @BeforeEach
    void setUp() {
        //this.repo = new InMemoryTelevisionRepository();

        Television defaultTv = new Television();
        defaultTv.setId(25);
        defaultTv.setBrand("Sony");
        defaultTv.setModel("X39-7");
        defaultTv.setYear(2020);

        repo.addTelevision(defaultTv);
    }

    @Test
    void addTelevision() {
    }

    @Test
    void removeTelevisionByIdShouldThrowExceptionOnInvalidId() {
        //empty repo has no televisions
        //no id should be valid yet because we haven't added
        //any tvs

        //this should throw an exception
        assertThrows( IllegalArgumentException.class, () -> repo.removeTelevisionById(1000) );

    }

    @Test
    void removeTelevisionByIdShouldShouldRemoveOnValidId() {

        List<Television> allTvsBeforeRemove = repo.getAllTelevisions();
        assertEquals(1, allTvsBeforeRemove.size());

        repo.removeTelevisionById(25);
        List<Television> allTVsAfterRemove = repo.getAllTelevisions();

        assertEquals(0, allTVsAfterRemove.size());
    }

    @Test
    void getAllTelevisions() {
    }
}