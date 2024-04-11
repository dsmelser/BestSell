package com.bestsell.testingdemo.data;

import com.bestsell.testingdemo.models.Television;
import java.util.List;

public interface TelevisionRepository {

    void addTelevision(Television toAdd);

    void removeTelevisionById(int tvId) throws IllegalArgumentException;

    List<Television> getAllTelevisions();

}
