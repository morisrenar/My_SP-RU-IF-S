package com.smnirjhor.facilities.generics.schedulings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
@Service
public class SchedulingsService {
    @Autowired
    SchedulingsRepository schedulingsRepository;


    public List<Schedulings> getAllSchedulings(String facilityId) {
        return schedulingsRepository.findByFacilitiesFacilitiesId(facilityId);
    }

    public Schedulings getSchedulings(String facilityId, String facilitiesSchedulingsId) {
        return schedulingsRepository.findOne(facilitiesSchedulingsId);
    }

    public void createSchedulings(Schedulings schedulings) {
        schedulingsRepository.save(schedulings);
    }

    public void updateSchedulings(Schedulings schedulings) {
        schedulingsRepository.save(schedulings);
    }

    public void deleteSchedulings(String facilitiesSchedulingsId) {
        schedulingsRepository.delete(facilitiesSchedulingsId);
    }
}
