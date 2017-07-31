package com.smnirjhor.facilities.ictcenter.netconnectionslocation;

import com.smnirjhor.facilities.Facilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
@RestController
@RequestMapping("/ru/facilities")
public class NetConnectionsLocationsController {
    @Autowired
    NetConnectionsLocationService netConnectionsLocationService;

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/netConnectionsLocation")
    public List<NetConnectionsLocation> getAllNetConnectionsLocation(@PathVariable String facilityId) {
        return netConnectionsLocationService.getAllNetConnectionsLocation(facilityId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/netConnectionsLocation/{facilitiesNetConnectionsLocationId}")
    public NetConnectionsLocation getNetConnectionsLocationId(@PathVariable String facilityId, @PathVariable String facilitiesNetConnectionsLocationId) {
        return netConnectionsLocationService.getNetConnectionsLocation(facilityId, facilitiesNetConnectionsLocationId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{facilityId}/netConnectionsLocation")
    public void createnetConnectionsLocation(@RequestBody NetConnectionsLocation netConnectionsLocation, @PathVariable String facilityId) {
        netConnectionsLocation.setFacilities(new Facilities(facilityId, "", ""));
        netConnectionsLocationService.createNetConnectionsLocation(netConnectionsLocation);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{facilityId}/netConnectionsLocation/{facilitiesNetConnectionsLocationId}")
    public void updateNetConnectionsLocation(@RequestBody NetConnectionsLocation netConnectionsLocation, @PathVariable String facilityId, @PathVariable String facilitiesNetConnectionsLocationId) {
        netConnectionsLocation.setFacilities(new Facilities(facilityId, "", ""));
        netConnectionsLocationService.updateNetConnectionsLocation(netConnectionsLocation);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{facilityId}/netConnectionsLocation/{facilitiesNetConnectionsLocationId}")
    public void deleteNetConnectionsLocation(@PathVariable String facilityId, @PathVariable String facilitiesNetConnectionsLocationId) {
        netConnectionsLocationService.deleteNetConnectionsLocation(facilitiesNetConnectionsLocationId);
    }
}
