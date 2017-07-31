package com.smnirjhor.facilities.generics.schedulings;

import com.smnirjhor.facilities.Facilities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
@Entity
public class Schedulings {
    @Id
    private String facilitiesSchedulingsId;
    private String facilitiesSchedulingsStartTime;
    private String facilitiesSchedulingsEndTime;
    @ManyToOne
    private Facilities facilities;

    public Schedulings() {
    }

    public Schedulings(String facilitiesSchedulingsId, String facilitiesSchedulingsStartTime, String facilitiesSchedulingsEndTime, Facilities facilities) {
        this.facilitiesSchedulingsId = facilitiesSchedulingsId;
        this.facilitiesSchedulingsStartTime = facilitiesSchedulingsStartTime;
        this.facilitiesSchedulingsEndTime = facilitiesSchedulingsEndTime;
        this.facilities = facilities;
    }

    public String getFacilitiesSchedulingsId() {
        return facilitiesSchedulingsId;
    }

    public void setFacilitiesSchedulingsId(String facilitiesSchedulingsId) {
        this.facilitiesSchedulingsId = facilitiesSchedulingsId;
    }

    public String getFacilitiesSchedulingsStartTime() {
        return facilitiesSchedulingsStartTime;
    }

    public void setFacilitiesSchedulingsStartTime(String facilitiesSchedulingsStartTime) {
        this.facilitiesSchedulingsStartTime = facilitiesSchedulingsStartTime;
    }

    public String getFacilitiesSchedulingsEndTime() {
        return facilitiesSchedulingsEndTime;
    }

    public void setFacilitiesSchedulingsEndTime(String facilitiesSchedulingsEndTime) {
        this.facilitiesSchedulingsEndTime = facilitiesSchedulingsEndTime;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }
}
