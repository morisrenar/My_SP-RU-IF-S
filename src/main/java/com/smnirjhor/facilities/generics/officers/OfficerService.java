package com.smnirjhor.facilities.generics.officers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@Service
public class OfficerService {
    @Autowired
    OfficerRepository officerRepository;

    public List<Officer> getAllOfficers(String facilityId) {
        List<Officer> officers = new ArrayList<>();
        for(Officer off: officerRepository.findByFacilitiesFacilitiesId(facilityId)) {
            officers.add(off);
        }
        return officers;
    }

    public Officer getOfficers(String facilityId, String facilitiesOfficersId) {
        return officerRepository.findOne(facilitiesOfficersId);
    }

    public void createOfficers(Officer officer) {
        officerRepository.save(officer);
    }

    public void updateOfficers(Officer officer) {
        officerRepository.save(officer);
    }

    public void deleteOfficers(String facilitiesOfficersId) {
        officerRepository.delete(facilitiesOfficersId);
    }
}
