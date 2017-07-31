package com.smnirjhor.facilities.generics.stuffs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@Service
public class StuffsService {
    @Autowired
    StuffsRepository stuffsRepository;


    public List<Stuffs> getAllStuffs(String facilityId) {
        List<Stuffs> stuffs = new ArrayList<>();
        for(Stuffs stf: stuffsRepository.findByFacilitiesFacilitiesId(facilityId)) {
            stuffs.add(stf);
        }
        return stuffs;
    }

    public Stuffs getStuff(String facilityId, String facilitiesStuffsId) {
        return stuffsRepository.findOne(facilitiesStuffsId);
    }


    public void createStuffs(Stuffs stuffs) {
        stuffsRepository.save(stuffs);
    }

    public void updateStuffs(Stuffs stuffs) {
        stuffsRepository.save(stuffs);
    }

    public void deleteStuffs(String facilitiesStuffsId) {
        stuffsRepository.delete(facilitiesStuffsId);
    }
}
