package com.bestsell.testingdemo.services;

import com.bestsell.testingdemo.data.TelevisionRepository;
import com.bestsell.testingdemo.models.Television;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelevisionService {

    @Autowired
    private TelevisionRepository televisionRepository;

    @Autowired
    public TelevisionService(TelevisionRepository televisionRepository) {
        this.televisionRepository = televisionRepository;
    }

    public Result AddTelevision( Television toAdd) {
        return null;
    }

    public Result RemoveTelevisionById( int tvId ){
        return null;
    }

    public List<Television> GetAllTVs(){
        return null;
    }


}
