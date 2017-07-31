package com.smnirjhor.facilities.ictcenter.idprovidesconsumer;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
public interface IdProvidesConsumerRepository extends CrudRepository<IdProvidesConsumer, String> {
    public List<IdProvidesConsumer> findByFacilitiesFacilitiesId(String facilitiesId);
}
