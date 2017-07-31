package com.smnirjhor.facilities.medicalcenter.ambulanceservice;

import com.smnirjhor.facilities.Facilities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by bmshamsnahid on 7/28/17.
 */
@Entity
public class AmbulanceService {
    @Id
    private String facilitiesAmbulanceServiceId;
    private String facilitiesAmbulanceServiceInfo;
    @ManyToOne
    private Facilities facilities;

    public AmbulanceService() {
    }

    public AmbulanceService(String facilitiesAmbulanceServiceId, String facilitiesAmbulanceServiceInfo, Facilities facilities) {
        this.facilitiesAmbulanceServiceId = facilitiesAmbulanceServiceId;
        this.facilitiesAmbulanceServiceInfo = facilitiesAmbulanceServiceInfo;
        this.facilities = facilities;
    }

    public String getFacilitiesAmbulanceServiceId() {
        return facilitiesAmbulanceServiceId;
    }

    public void setFacilitiesAmbulanceServiceId(String facilitiesAmbulanceServiceId) {
        this.facilitiesAmbulanceServiceId = facilitiesAmbulanceServiceId;
    }

    public String getFacilitiesAmbulanceServiceInfo() {
        return facilitiesAmbulanceServiceInfo;
    }

    public void setFacilitiesAmbulanceServiceInfo(String facilitiesAmbulanceServiceInfo) {
        this.facilitiesAmbulanceServiceInfo = facilitiesAmbulanceServiceInfo;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }
}
