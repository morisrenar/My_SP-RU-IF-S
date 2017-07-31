package com.smnirjhor.facilities.ictcenter.idprovidesconsumer;

import com.smnirjhor.facilities.Facilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
@RestController
@RequestMapping("/ru/facilities")
public class IdProvidesConsumerController {
    @Autowired
    IdProvidesConsumerService idProvidesConsumerService;

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/idProvidesConsumer")
    public List<IdProvidesConsumer> getAllIdProvidesConsumer(@PathVariable String facilityId) {
        return idProvidesConsumerService.getAllIdProvidesConsumer(facilityId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/idProvidesConsumer/{facilitiesIdProvidesConsumerId}")
    public IdProvidesConsumer getIdProvidesConsumer(@PathVariable String facilityId, @PathVariable String facilitiesIdProvidesConsumerId) {
        return idProvidesConsumerService.getIdProvidesConsumer(facilityId, facilitiesIdProvidesConsumerId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{facilityId}/idProvidesConsumer")
    public void createIdProvidesConsumer(@RequestBody IdProvidesConsumer idProvidesConsumer, @PathVariable String facilityId) {
        idProvidesConsumer.setFacilities(new Facilities(facilityId, "", ""));
        idProvidesConsumerService.createIdProvidesConsumer(idProvidesConsumer);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{facilityId}/idProvidesConsumer/{facilitiesIdProvidesConsumerId}")
    public void updateIdProvidesConsumer(@RequestBody IdProvidesConsumer idProvidesConsumer, @PathVariable String facilityId, @PathVariable String facilitiesIdProvidesConsumerId) {
        idProvidesConsumer.setFacilities(new Facilities(facilityId, "", ""));
        idProvidesConsumerService.updateIdProvidesConsumer(idProvidesConsumer);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{facilityId}/idProvidesConsumer/{facilitiesIdProvidesConsumerId}")
    public void deleteIdProvidesConsumer(@PathVariable String facilityId, @PathVariable String facilitiesIdProvidesConsumerId) {
        idProvidesConsumerService.deleteIdProvidesConsumer(facilitiesIdProvidesConsumerId);
    }
}
