package com.smnirjhor.facilities.generics.directors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@Service
public class DirectorsService {
    @Autowired
    DirectorsRepository directorsRepository;

    public List<Directors> getAllDirectors(String facilityId) {
        List<Directors> directors = new ArrayList<>();
        for(Directors dir: directorsRepository.findByFacilitiesFacilitiesId(facilityId)) {
            directors.add(dir);
            System.out.println(dir.getFacilities().getFacilitiesId());
        }
        return  directors;
    }

    public Directors getDirector(String facilityId, String facilitiesDirectorsId) {
        return directorsRepository.findOne(facilitiesDirectorsId);
    }

    public void createDirectors(Directors directors) {
        directorsRepository.save(directors);
    }

    public void updateDirectors(Directors directors) {
        directorsRepository.save(directors);
    }

    public void deleteDirectors(String facilitiesDirectorsId) {
        directorsRepository.delete(facilitiesDirectorsId);
    }
}
