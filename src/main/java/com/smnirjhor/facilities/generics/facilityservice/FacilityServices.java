package com.smnirjhor.facilities.generics.facilityservice;

import com.smnirjhor.facilities.Facilities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by bmshamsnahid on 7/24/17.
 */
@Entity
public class FacilityServices {

    @Id
    private String facilityServicesId;
    private String facilityServicesName;
    private String getFacilityServicesInfo;
    @ManyToOne
    private Facilities facilities;

    public FacilityServices() {
    }

    public FacilityServices(String facilityServicesId, String facilityServicesName, String getFacilityServicesInfo, Facilities facilities) {
        this.facilityServicesId = facilityServicesId;
        this.facilityServicesName = facilityServicesName;
        this.getFacilityServicesInfo = getFacilityServicesInfo;
        this.facilities = facilities;
    }

    public String getFacilityServicesId() {
        return facilityServicesId;
    }

    public void setFacilityServicesId(String facilityServicesId) {
        this.facilityServicesId = facilityServicesId;
    }

    public String getFacilityServicesName() {
        return facilityServicesName;
    }

    public void setFacilityServicesName(String facilityServicesName) {
        this.facilityServicesName = facilityServicesName;
    }

    public String getGetFacilityServicesInfo() {
        return getFacilityServicesInfo;
    }

    public void setGetFacilityServicesInfo(String getFacilityServicesInfo) {
        this.getFacilityServicesInfo = getFacilityServicesInfo;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }
}
