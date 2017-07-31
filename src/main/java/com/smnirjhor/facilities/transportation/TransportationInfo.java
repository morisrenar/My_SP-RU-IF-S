package com.smnirjhor.facilities.transportation;

import com.smnirjhor.facilities.Facilities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by bmshamsnahid on 7/28/17.
 */
@Entity
public class TransportationInfo {
    @Id
    private String facilitiesTransportationInfoId;
    private String facilitiesTransportationInfoIdentifier;
    private String facilitiesTransportationInfoSchedule;
    private String facilitiesTransportationInfoRoute;
    private String facilitiesTransportationInfoDestination;
    @ManyToOne
    private Facilities facilities;

    public TransportationInfo() {
    }

    public TransportationInfo(String facilitiesTransportationInfoId, String facilitiesTransportationInfoIdentifier, String facilitiesTransportationInfoSchedule, String facilitiesTransportationInfoRoute, String facilitiesTransportationInfoDestination, Facilities facilities) {
        this.facilitiesTransportationInfoId = facilitiesTransportationInfoId;
        this.facilitiesTransportationInfoIdentifier = facilitiesTransportationInfoIdentifier;
        this.facilitiesTransportationInfoSchedule = facilitiesTransportationInfoSchedule;
        this.facilitiesTransportationInfoRoute = facilitiesTransportationInfoRoute;
        this.facilitiesTransportationInfoDestination = facilitiesTransportationInfoDestination;
        this.facilities = facilities;
    }

    public String getFacilitiesTransportationInfoId() {
        return facilitiesTransportationInfoId;
    }

    public void setFacilitiesTransportationInfoId(String facilitiesTransportationInfoId) {
        this.facilitiesTransportationInfoId = facilitiesTransportationInfoId;
    }

    public String getFacilitiesTransportationInfoIdentifier() {
        return facilitiesTransportationInfoIdentifier;
    }

    public void setFacilitiesTransportationInfoIdentifier(String facilitiesTransportationInfoIdentifier) {
        this.facilitiesTransportationInfoIdentifier = facilitiesTransportationInfoIdentifier;
    }

    public String getFacilitiesTransportationInfoSchedule() {
        return facilitiesTransportationInfoSchedule;
    }

    public void setFacilitiesTransportationInfoSchedule(String facilitiesTransportationInfoSchedule) {
        this.facilitiesTransportationInfoSchedule = facilitiesTransportationInfoSchedule;
    }

    public String getFacilitiesTransportationInfoRoute() {
        return facilitiesTransportationInfoRoute;
    }

    public void setFacilitiesTransportationInfoRoute(String facilitiesTransportationInfoRoute) {
        this.facilitiesTransportationInfoRoute = facilitiesTransportationInfoRoute;
    }

    public String getFacilitiesTransportationInfoDestination() {
        return facilitiesTransportationInfoDestination;
    }

    public void setFacilitiesTransportationInfoDestination(String facilitiesTransportationInfoDestination) {
        this.facilitiesTransportationInfoDestination = facilitiesTransportationInfoDestination;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }
}
