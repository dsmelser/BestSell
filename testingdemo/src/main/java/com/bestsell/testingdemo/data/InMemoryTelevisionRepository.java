package com.bestsell.testingdemo.data;

import com.bestsell.testingdemo.models.Television;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryTelevisionRepository implements TelevisionRepository {

    List<Television> allTelevisions = new ArrayList<Television>();

    @Override
    public void addTelevision(Television toAdd) {
        allTelevisions.add( toAdd );
    }

    @Override
    public void removeTelevisionById(int tvId) throws IllegalArgumentException{

        int indexOfMatchingTv = -1;

        for( int i = 0; i < allTelevisions.size(); i++ ) {
            Television toCheck = allTelevisions.get( i );

            if( toCheck.getId() == tvId ) {
                indexOfMatchingTv = i;
            }
        }

        if( indexOfMatchingTv != -1 ) {
            allTelevisions.remove( indexOfMatchingTv );
        }
        else
        {
            throw new IllegalArgumentException("Could not find id = " + tvId);
        }
    }

    @Override
    public List<Television> getAllTelevisions() {
        //copy list and return that
        List<Television> copy = new ArrayList<>();
        copy.addAll( allTelevisions );

        return copy;
    }
}
