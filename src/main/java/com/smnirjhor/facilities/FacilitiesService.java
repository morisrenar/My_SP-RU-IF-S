package com.smnirjhor.facilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bmshamsnahid on 7/24/17.
 */
@Service
public class FacilitiesService {

    @Autowired
    FacilitiesRepository facilitiesRepository;

    public List<Facilities> getAllFacilities() {
        List<Facilities> facilities = new ArrayList<>();
        for(Facilities fc : facilitiesRepository.findAll()) {
            facilities.add(fc);
        }
        return facilities;
    }

    public Facilities getFacility(String facilityId) {
        return facilitiesRepository.findOne(facilityId);
    }

    public void addFacility(Facilities facilities) {
        facilitiesRepository.save(facilities);
    }

    public void updateFacility(Facilities facilities) {
        facilitiesRepository.save(facilities);
    }

    public void deleteFacility(Facilities facilities) {
        facilitiesRepository.delete(facilities);
    }
}
