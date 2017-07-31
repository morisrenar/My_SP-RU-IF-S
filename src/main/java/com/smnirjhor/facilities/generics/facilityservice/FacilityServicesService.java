package com.smnirjhor.facilities.generics.facilityservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/24/17.
 */
@Service
public class FacilityServicesService {

    @Autowired
    FacilityServicesRepository facilityServicesRepository;

    public List<FacilityServices> getAllFacilityServices(String facilityId) {
        return  facilityServicesRepository.findByFacilitiesFacilitiesId(facilityId);
    }

    public FacilityServices getFacilityService(String facilityId, String facilityServiceId) {
        List<FacilityServices> facilityServices = facilityServicesRepository.findByFacilitiesFacilitiesId(facilityId);
        for(FacilityServices fs : facilityServices) {
            if(fs.getFacilityServicesId().equals(facilityServiceId)) {
                return fs;
            }
        }
        return null;
    }

    public void addFacilityServices(FacilityServices facilityServices) {
        facilityServicesRepository.save(facilityServices);
    }

    public void updateFacilityServices(FacilityServices facilityServices) {
        //facilityServicesRepository.delete(facilityServices.getFacilityServicesId());
        facilityServicesRepository.save(facilityServices);
    }

    public void deleteFacilityServices(String facilityServiceId) {
        facilityServicesRepository.delete(facilityServiceId);
    }
}
