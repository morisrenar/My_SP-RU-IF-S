package com.smnirjhor.facilities.medicalcenter.ambulanceservice;

import com.smnirjhor.facilities.Facilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/28/17.
 */
@RestController
@RequestMapping("/ru/facilities")
public class AmbulanceServiceController {
    @Autowired
    AmbulanceServiceService ambulanceServiceService;

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/ambulanceService")
    public List<AmbulanceService> getAllAmbulanceService(@PathVariable String facilityId) {
        return ambulanceServiceService.getAllAmbulanceService(facilityId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/ambulanceService/{facilitiesAmbulanceServiceId}")
    public AmbulanceService getAllAmbulanceService(@PathVariable String facilityId, @PathVariable String facilitiesAmbulanceServiceId) {
        return ambulanceServiceService.getAmbulanceService(facilityId, facilitiesAmbulanceServiceId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{facilityId}/ambulanceService")
    public void createAmbulanceService(@RequestBody AmbulanceService ambulanceService, @PathVariable String facilityId) {
        ambulanceService.setFacilities(new Facilities(facilityId, "", ""));
        ambulanceServiceService.createAmbulanceService(ambulanceService);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{facilityId}/ambulanceService/{facilitiesAmbulanceServiceId}")
    public void updateAmbulanceService(@RequestBody AmbulanceService ambulanceService, @PathVariable String facilityId, @PathVariable String facilitiesAmbulanceServiceId) {
        ambulanceService.setFacilities(new Facilities(facilityId, "", ""));
        ambulanceServiceService.updateAmbulanceService(ambulanceService);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{facilityId}/ambulanceService/{facilitiesAmbulanceServiceId}")
    public void deleteAmbulanceService(@PathVariable String facilityId, @PathVariable String facilitiesAmbulanceServiceId) {
        ambulanceServiceService.deleteAmbulanceService(facilitiesAmbulanceServiceId);
    }
}
