package com.smnirjhor.facilities.medicalcenter.ambulanceservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/28/17.
 */
@Service
public class AmbulanceServiceService {
    @Autowired
    AmbulanceServiceRepository ambulanceServiceRepository;

    public List<AmbulanceService> getAllAmbulanceService(String facilityId) {
        return ambulanceServiceRepository.findByFacilitiesFacilitiesId(facilityId);
    }

    public AmbulanceService getAmbulanceService(String facilityId, String facilitiesAmbulanceServiceId) {
        return ambulanceServiceRepository.findOne(facilitiesAmbulanceServiceId);
    }

    public void createAmbulanceService(AmbulanceService ambulanceService) {
        ambulanceServiceRepository.save(ambulanceService);
    }

    public void updateAmbulanceService(AmbulanceService ambulanceService) {
        ambulanceServiceRepository.save(ambulanceService);
    }

    public void deleteAmbulanceService(String facilitiesAmbulanceServiceId) {
        ambulanceServiceRepository.delete(facilitiesAmbulanceServiceId);
    }
}
