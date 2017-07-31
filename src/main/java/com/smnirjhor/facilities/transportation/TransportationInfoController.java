package com.smnirjhor.facilities.transportation;

import com.smnirjhor.facilities.Facilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/28/17.
 */
@RestController
@RequestMapping("/ru/facilities")
public class TransportationInfoController {
    @Autowired
    TransportationInfoService transportationInfoService;

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/transportationInfo")
    public List<TransportationInfo> getAllTransportationInfo(@PathVariable String facilityId) {
        return transportationInfoService.getAllTransportationInfo(facilityId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/transportationInfo/{facilitiesTransportationInfoId}")
    public TransportationInfo getTransportationInfo(@PathVariable String facilityId, @PathVariable String facilitiesTransportationInfoId) {
        return transportationInfoService.getTransportationInfo(facilityId, facilitiesTransportationInfoId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{facilityId}/transportationInfo")
    public void createTransportationInfo(@RequestBody TransportationInfo transportationInfo, @PathVariable String facilityId) {
        transportationInfo.setFacilities(new Facilities(facilityId, "", ""));
        transportationInfoService.createTransportationInfo(transportationInfo);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{facilityId}/transportationInfo/{facilitiesTransportationInfoId}")
    public void updateTransportationInfo(@RequestBody TransportationInfo transportationInfo, @PathVariable String facilityId, @PathVariable String facilitiesTransportationInfoId) {
        transportationInfo.setFacilities(new Facilities(facilityId, "", ""));
        transportationInfoService.updateTransportationInfo(transportationInfo);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{facilityId}/transportationInfo/{facilitiesTransportationInfoId}")
    public void deleteTransportationInfo(@PathVariable String facilityId, @PathVariable String facilitiesTransportationInfoId) {
        transportationInfoService.deleteTransportationInfo(facilitiesTransportationInfoId);
    }
}
