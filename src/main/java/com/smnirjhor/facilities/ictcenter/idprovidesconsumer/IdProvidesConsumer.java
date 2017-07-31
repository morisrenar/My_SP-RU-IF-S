package com.smnirjhor.facilities.ictcenter.idprovidesconsumer;

import com.smnirjhor.facilities.Facilities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
@Entity
public class IdProvidesConsumer {
    @Id
    private String facilitiesIdProvidesConsumersId;
    private String facilitiesIdProvidesConsumersCategory;
    @ManyToOne
    private Facilities facilities;

    public IdProvidesConsumer() {
    }

    public IdProvidesConsumer(String facilitiesIdProvidesConsumersId, String facilitiesIdProvidesConsumersCategory, Facilities facilities) {
        this.facilitiesIdProvidesConsumersId = facilitiesIdProvidesConsumersId;
        this.facilitiesIdProvidesConsumersCategory = facilitiesIdProvidesConsumersCategory;
        this.facilities = facilities;
    }

    public String getFacilitiesIdProvidesConsumersId() {
        return facilitiesIdProvidesConsumersId;
    }

    public void setFacilitiesIdProvidesConsumersId(String facilitiesIdProvidesConsumersId) {
        this.facilitiesIdProvidesConsumersId = facilitiesIdProvidesConsumersId;
    }

    public String getFacilitiesIdProvidesConsumersCategory() {
        return facilitiesIdProvidesConsumersCategory;
    }

    public void setFacilitiesIdProvidesConsumersCategory(String facilitiesIdProvidesConsumersCategory) {
        this.facilitiesIdProvidesConsumersCategory = facilitiesIdProvidesConsumersCategory;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }
}
