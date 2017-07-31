package com.smnirjhor.facilities.ictcenter.idprovidesconsumer.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
@Service
public class ConsumerService {
    @Autowired
    ConsumerRepository consumerRepository;

    public List<Consumer> getAllConsumers(String facilityId, String facilitiesIdProvidesConsumerId) {
        return consumerRepository.findByIdProvidesConsumerFacilitiesIdProvidesConsumersId(facilitiesIdProvidesConsumerId);
    }

    public Consumer getConsumer(String facilityId, String facilitiesIdProvidesConsumerId, String idProvidesConsumerId) {
        return consumerRepository.findOne(idProvidesConsumerId);
    }

    public void createConsumer(Consumer consumer) {
        consumerRepository.save(consumer);
    }

    public void updateConsumer(Consumer consumer) {
        consumerRepository.save(consumer);
    }

    public void deleteConsumer(String idProvidesConsumerId) {
        consumerRepository.delete(idProvidesConsumerId);
    }
}
