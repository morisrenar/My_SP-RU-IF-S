package com.smnirjhor.facilities.ictcenter.idprovidesconsumer;

import com.smnirjhor.facilities.Facilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
@Service
public class IdProvidesConsumerService {
    @Autowired
    IdProvidesConsumerRepository idProvidesConsumerRepository;

    public List<IdProvidesConsumer> getAllIdProvidesConsumer(String facilityId) {
        return idProvidesConsumerRepository.findByFacilitiesFacilitiesId(facilityId);
    }

    public IdProvidesConsumer getIdProvidesConsumer(String facilityId, String facilitiesIdProvidesConsumerId) {
        return idProvidesConsumerRepository.findOne(facilitiesIdProvidesConsumerId);
    }

    public void createIdProvidesConsumer(IdProvidesConsumer idProvidesConsumer) {
        idProvidesConsumerRepository.save(idProvidesConsumer);
    }

    public void updateIdProvidesConsumer(IdProvidesConsumer idProvidesConsumer) {
        idProvidesConsumerRepository.save(idProvidesConsumer);
    }

    public void deleteIdProvidesConsumer(String facilitiesIdProvidesConsumerId) {
        idProvidesConsumerRepository.delete(facilitiesIdProvidesConsumerId);
    }
}
