package com.smnirjhor.facilities.generics.officers;

import com.smnirjhor.facilities.Facilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@RestController
@RequestMapping("/ru/facilities")
public class OfficerController {
    @Autowired
    OfficerService officerService;

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/officers")
    public List<Officer> getAllOfficers(@PathVariable String facilityId) {
        return officerService.getAllOfficers(facilityId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/officers/{facilitiesOfficersId}")
    public Officer getOfficer(@PathVariable String facilityId, @PathVariable String facilitiesOfficersId) {
        return officerService.getOfficers(facilityId, facilitiesOfficersId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{facilityId}/officers")
    public void createOfficers(@RequestBody Officer officer, @PathVariable String facilityId) {
        officer.setFacilities(new Facilities(facilityId, "", ""));
        officerService.createOfficers(officer);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{facilityId}/officers/{facilitiesOfficersId}")
    public void updateOfficers(@RequestBody Officer officer, @PathVariable String facilityId, @PathVariable String facilitiesOfficersId) {
        officer.setFacilities(new Facilities(facilityId, "", ""));
        officerService.updateOfficers(officer);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{facilityId}/officers/{facilitiesOfficersId}")
    public void deleteOfficers(@PathVariable String facilityId, @PathVariable String facilitiesOfficersId) {
        officerService.deleteOfficers(facilitiesOfficersId);
    }

}
