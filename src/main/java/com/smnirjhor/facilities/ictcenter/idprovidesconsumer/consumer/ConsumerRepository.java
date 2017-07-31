package com.smnirjhor.facilities.ictcenter.idprovidesconsumer.consumer;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
public interface ConsumerRepository extends CrudRepository<Consumer, String> {
    public List<Consumer> findByIdProvidesConsumerFacilitiesIdProvidesConsumersId(String facilitiesIdProvidesConsumersId);
}
