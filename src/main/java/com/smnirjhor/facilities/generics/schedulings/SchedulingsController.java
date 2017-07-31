package com.smnirjhor.facilities.generics.schedulings;

import com.smnirjhor.facilities.Facilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
@RestController
@RequestMapping("/ru/facilities")
public class SchedulingsController {
    @Autowired
    SchedulingsService schedulingsService;

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/schedulings")
    public List<Schedulings> getAllSchedulings(@PathVariable String facilityId) {
        return schedulingsService.getAllSchedulings(facilityId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/schedulings/{facilitiesSchedulingsId}")
    public Schedulings getSchedulings(@PathVariable String facilityId, @PathVariable String facilitiesSchedulingsId) {
        return schedulingsService.getSchedulings(facilityId, facilitiesSchedulingsId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{facilityId}/schedulings")
    public void createSchedulings(@RequestBody Schedulings schedulings, @PathVariable String facilityId) {
        schedulings.setFacilities(new Facilities(facilityId, "", ""));
        schedulingsService.createSchedulings(schedulings);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{facilityId}/schedulings/{facilitiesSchedulingsId}")
    public void updateSchedulings(@RequestBody Schedulings schedulings, @PathVariable String facilityId, @PathVariable String facilitiesSchedulingsId) {
        schedulings.setFacilities(new Facilities(facilityId, "", ""));
        schedulingsService.updateSchedulings(schedulings);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{facilityId}/schedulings/{facilitiesSchedulingsId}")
    public void deleteSchedulings(@PathVariable String facilityId, @PathVariable String facilitiesSchedulingsId) {
        schedulingsService.deleteSchedulings(facilitiesSchedulingsId);
    }
}
