package com.smnirjhor.facilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/24/17.
 */
@RestController
@RequestMapping("/ru")
public class FacilitiesController {

    @Autowired
    FacilitiesService facilitiesService;

    @RequestMapping("/hello")
    public String helloFacilities() {
        return "Hello from facilities!!!";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/facilities")
    public List<Facilities> getAllFacilities() {
        return facilitiesService.getAllFacilities();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/facilities/{facilityId}")
    public Facilities getFacilities(@PathVariable String facilityId) {
        return facilitiesService.getFacility(facilityId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/facilities")
    public void addFacilities(@RequestBody Facilities facilities) {
        facilitiesService.addFacility(facilities);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/facilities/{facilityId}")
    public void updateFacilities(@RequestBody Facilities facilities, @PathVariable String facilityId) {
        facilitiesService.updateFacility(facilities);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/facilities/{facilityId}")
    public void deleteFacilities(@RequestBody Facilities facilities, @PathVariable String facilityId) {
        facilitiesService.deleteFacility(facilities);
    }
}
