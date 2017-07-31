package com.smnirjhor.facilities.generics.events;

import com.smnirjhor.facilities.Facilities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@Entity
public class Events {
    @Id
    private String facilitiesEventsId;
    private String facilitiesEventsName;
    private String facilitiesEventsDate;
    private String facilitiesEventsShortInfo;
    private String facilitiesEventsFullInfo;
    @ManyToOne
    private Facilities facilities;

    public Events() {
    }

    public Events(String facilitiesEventsId, String facilitiesEventsName, String facilitiesEventsDate, String facilitiesEventsShortInfo, String facilitiesEventsFullInfo, Facilities facilities) {
        this.facilitiesEventsId = facilitiesEventsId;
        this.facilitiesEventsName = facilitiesEventsName;
        this.facilitiesEventsDate = facilitiesEventsDate;
        this.facilitiesEventsShortInfo = facilitiesEventsShortInfo;
        this.facilitiesEventsFullInfo = facilitiesEventsFullInfo;
        this.facilities = facilities;
    }

    public String getFacilitiesEventsId() {
        return facilitiesEventsId;
    }

    public void setFacilitiesEventsId(String facilitiesEventsId) {
        this.facilitiesEventsId = facilitiesEventsId;
    }

    public String getFacilitiesEventsName() {
        return facilitiesEventsName;
    }

    public void setFacilitiesEventsName(String facilitiesEventsName) {
        this.facilitiesEventsName = facilitiesEventsName;
    }

    public String getFacilitiesEventsDate() {
        return facilitiesEventsDate;
    }

    public void setFacilitiesEventsDate(String facilitiesEventsDate) {
        this.facilitiesEventsDate = facilitiesEventsDate;
    }

    public String getFacilitiesEventsShortInfo() {
        return facilitiesEventsShortInfo;
    }

    public void setFacilitiesEventsShortInfo(String facilitiesEventsShortInfo) {
        this.facilitiesEventsShortInfo = facilitiesEventsShortInfo;
    }

    public String getFacilitiesEventsFullInfo() {
        return facilitiesEventsFullInfo;
    }

    public void setFacilitiesEventsFullInfo(String facilitiesEventsFullInfo) {
        this.facilitiesEventsFullInfo = facilitiesEventsFullInfo;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }
}
