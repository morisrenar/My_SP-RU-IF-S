package com.smnirjhor.facilities.generics.stuffs;

import com.smnirjhor.facilities.Facilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@RestController
@RequestMapping("/ru/facilities")
public class StuffsController {
    @Autowired
    StuffsService stuffsService;

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/stuffs")
    public List<Stuffs> getAllStuffs(@PathVariable String facilityId) {
        return stuffsService.getAllStuffs(facilityId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/stuffs/{facilitiesStuffsId}")
    public Stuffs getStuff(@PathVariable String facilityId, @PathVariable String facilitiesStuffsId) {
        return stuffsService.getStuff(facilityId, facilitiesStuffsId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{facilityId}/stuffs")
    public void createStuffs(@RequestBody Stuffs stuffs, @PathVariable String facilityId) {
        stuffs.setFacilities(new Facilities(facilityId, "", ""));
        stuffsService.createStuffs(stuffs);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{facilityId}/stuffs/{facilitiesStuffsId}")
    public void updateStuffs(@RequestBody Stuffs stuffs, @PathVariable String facilityId, @PathVariable String facilitiesStuffsId) {
        stuffs.setFacilities(new Facilities(facilityId, "", ""));
        stuffsService.updateStuffs(stuffs);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{facilityId}/stuffs/{facilitiesStuffsId}")
    public void deleteStuffs(@PathVariable String facilityId, @PathVariable String facilitiesStuffsId) {
        stuffsService.deleteStuffs(facilitiesStuffsId);
    }

}
