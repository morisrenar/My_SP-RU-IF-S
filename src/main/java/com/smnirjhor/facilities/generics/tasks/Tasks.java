package com.smnirjhor.facilities.generics.tasks;

import com.smnirjhor.facilities.Facilities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@Entity
public class Tasks {

    @Id
    private String facilitiesTasksId;
    private String facilitiesTasksName;
    private String facilitiesTasksShortInfo;
    private String facilitiesTasksFullInfo;
    @ManyToOne
    private Facilities facilities;

    public Tasks() {
    }

    public Tasks(String facilitiesTasksId, String facilitiesTasksName, String facilitiesTasksShortInfo, String facilitiesTasksFullInfo, Facilities facilities) {
        this.facilitiesTasksId = facilitiesTasksId;
        this.facilitiesTasksName = facilitiesTasksName;
        this.facilitiesTasksShortInfo = facilitiesTasksShortInfo;
        this.facilitiesTasksFullInfo = facilitiesTasksFullInfo;
        this.facilities = facilities;
    }

    public String getFacilitiesTasksId() {
        return facilitiesTasksId;
    }

    public void setFacilitiesTasksId(String facilitiesTasksId) {
        this.facilitiesTasksId = facilitiesTasksId;
    }

    public String getFacilitiesTasksName() {
        return facilitiesTasksName;
    }

    public void setFacilitiesTasksName(String facilitiesTasksName) {
        this.facilitiesTasksName = facilitiesTasksName;
    }

    public String getFacilitiesTasksShortInfo() {
        return facilitiesTasksShortInfo;
    }

    public void setFacilitiesTasksShortInfo(String facilitiesTasksShortInfo) {
        this.facilitiesTasksShortInfo = facilitiesTasksShortInfo;
    }

    public String getFacilitiesTasksFullInfo() {
        return facilitiesTasksFullInfo;
    }

    public void setFacilitiesTasksFullInfo(String facilitiesTasksFullInfo) {
        this.facilitiesTasksFullInfo = facilitiesTasksFullInfo;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }
}
