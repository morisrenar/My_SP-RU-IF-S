package com.smnirjhor.facilities.generics.directors;

import com.smnirjhor.facilities.Facilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@RestController
@RequestMapping("/ru/facilities")
public class DirectorsController {
    @Autowired
    DirectorsService directorsService;

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/directors")
    public List<Directors> getAllDirectors(@PathVariable String facilityId) {
        return directorsService.getAllDirectors(facilityId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/directors/{facilitiesDirectorsId}")
    public Directors getDirector(@PathVariable String facilityId, @PathVariable String facilitiesDirectorsId) {
        return directorsService.getDirector(facilityId, facilitiesDirectorsId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{facilityId}/directors")
    public void createDirectors(@RequestBody Directors directors, @PathVariable String facilityId) {
        directors.setFacilities(new Facilities(facilityId, "", ""));
        directorsService.createDirectors(directors);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{facilityId}/directors/{facilitiesDirectorsId}")
    public void updateDirectors(@RequestBody Directors directors, @PathVariable String facilityId, @PathVariable String facilitiesDirectorsId) {
        directors.setFacilities(new Facilities(facilityId, "", ""));
        directorsService.updateDirectors(directors);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{facilityId}/directors/{facilitiesDirectorsId}")
    public void deleteDirectors(@PathVariable String facilityId, @PathVariable String facilitiesDirectorsId) {
        directorsService.deleteDirectors(facilitiesDirectorsId);
    }

}
