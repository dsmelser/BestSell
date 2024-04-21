package com.bestsell.testingdemo.data;

import com.bestsell.testingdemo.models.Television;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface JpaTelevisionRepository extends JpaRepository<Television, Integer> {
    @Query("SELECT new com.bestsell.testingdemo.models.Television(id, brand, model, color, year) FROM Television WHERE model LIKE %:term%")
    List<Television> findByModelPartial(@Param("term")  String modelSearchTerm);
}
