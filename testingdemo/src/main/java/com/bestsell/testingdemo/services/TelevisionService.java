package com.bestsell.testingdemo.services;

import com.bestsell.testingdemo.data.JpaTelevisionRepository;
import com.bestsell.testingdemo.data.TelevisionRepository;
import com.bestsell.testingdemo.models.Television;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelevisionService {

    @Autowired
    private JpaTelevisionRepository televisionRepository;

    @Autowired
    public TelevisionService(JpaTelevisionRepository televisionRepository) {
        this.televisionRepository = televisionRepository;
    }

    public Result addTelevision( Television toAdd) {
        //must have a model name
        //must have a brand name
        //color is optional
        //year is optional



        return null;
    }

    public Result removeTelevisionById( int tvId ){
        return null;
    }

    public List<Television> getAllTVs(){

        List<Television> allTvs = televisionRepository.findAll();

        //allTvs.get(0).setBrand("BAD DATA HAHAHAHA");

        return allTvs;
    }
}
