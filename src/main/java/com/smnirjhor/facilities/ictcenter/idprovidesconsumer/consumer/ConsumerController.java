package com.smnirjhor.facilities.ictcenter.idprovidesconsumer.consumer;

import com.smnirjhor.facilities.Facilities;
import com.smnirjhor.facilities.ictcenter.idprovidesconsumer.IdProvidesConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
@RestController
@RequestMapping("/ru/facilities")
public class ConsumerController {
    @Autowired
    ConsumerService consumerService;

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/idProvidesConsumer/{facilitiesIdProvidesConsumerId}/consumers")
    public List<Consumer> getAllConsumers(@PathVariable String facilityId, @PathVariable String facilitiesIdProvidesConsumerId) {
        return consumerService.getAllConsumers(facilityId, facilitiesIdProvidesConsumerId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/idProvidesConsumer/{facilitiesIdProvidesConsumerId}/consumers/{idProvidesConsumerId}")
    public Consumer getIdProvidesConsumer(@PathVariable String facilityId, @PathVariable String facilitiesIdProvidesConsumerId, @PathVariable String idProvidesConsumerId) {
        return consumerService.getConsumer(facilityId, facilitiesIdProvidesConsumerId, idProvidesConsumerId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{facilityId}/idProvidesConsumer/{facilitiesIdProvidesConsumerId}/consumers")
    public void createIdProvidesConsumer(@RequestBody Consumer consumer, @PathVariable String facilityId, @PathVariable String facilitiesIdProvidesConsumerId) {
        consumer.setIdProvidesConsumer(new IdProvidesConsumer(facilitiesIdProvidesConsumerId, "", new Facilities(facilityId, "", "")));
        consumerService.createConsumer(consumer);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{facilityId}/idProvidesConsumer/{facilitiesIdProvidesConsumerId}/consumers/{idProvidesConsumerId}")
    public void updateConsumer(@RequestBody Consumer consumer, @PathVariable String facilityId, @PathVariable String facilitiesIdProvidesConsumerId, @PathVariable String idProvidesConsumerId) {
        consumer.setIdProvidesConsumer(new IdProvidesConsumer(facilitiesIdProvidesConsumerId, "", new Facilities(facilityId, "", "")));
        consumerService.updateConsumer(consumer);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{facilityId}/idProvidesConsumer/{facilitiesIdProvidesConsumerId}/consumers/{idProvidesConsumerId}")
    public void deleteConsumer(@PathVariable String facilityId, @PathVariable String facilitiesIdProvidesConsumerId, @PathVariable String idProvidesConsumerId) {
        consumerService.deleteConsumer(idProvidesConsumerId);
    }
}
