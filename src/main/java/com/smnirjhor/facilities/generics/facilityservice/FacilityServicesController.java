package com.smnirjhor.facilities.generics.facilityservice;

import com.smnirjhor.facilities.Facilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/24/17.
 */
@RestController
@RequestMapping("/ru")
public class FacilityServicesController {

    @Autowired
    FacilityServicesService facilityServicesService;

    @RequestMapping(method = RequestMethod.GET, value = "/facilityService")
    public String facilityServices() {
        return "Hello Facility Service";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/facility/{facilityId}/facilityServices")
    public List<FacilityServices> getAllFacilityServices(@PathVariable String facilityId) {
        return facilityServicesService.getAllFacilityServices(facilityId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/facility/{facilityId}/facilityServices/{facilityServiceId}")
    public FacilityServices getFacilityService(@PathVariable String facilityId, @PathVariable String facilityServiceId) {
        return facilityServicesService.getFacilityService(facilityId, facilityServiceId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/facility/{facilityId}/facilityServices")
    public void addFacilityServices(@RequestBody FacilityServices facilityServices, @PathVariable String facilityId) {
        facilityServices.setFacilities(new Facilities(facilityId, "", ""));
        facilityServicesService.addFacilityServices(facilityServices);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/facility/{facilityId}/facilityServices/{facilityServiceId}")
    public void updateFacilityServices(@RequestBody FacilityServices facilityServices, @PathVariable String facilityId) {
        facilityServices.setFacilities(new Facilities(facilityId, "", ""));
        facilityServicesService.updateFacilityServices(facilityServices);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/facility/{facilityId}/facilityServices/{facilityServiceId}")
    public void deleteFacilityServices(@PathVariable String facilityServiceId) {
        facilityServicesService.deleteFacilityServices(facilityServiceId);
    }

}
