package com.smnirjhor.facilities.generics.fields;

import com.smnirjhor.facilities.Facilities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@Entity
public class Fields {
    @Id
    private String facilitiesFieldsId;
    private String facilitiesFieldsName;
    private String facilitiesFieldsShortInfo;
    private String facilitiesFieldsFullInfo;
    @ManyToOne
    private Facilities facilities;

    public Fields() {
    }

    public Fields(String facilitiesFieldsId, String facilitiesFieldsName, String facilitiesFieldsShortInfo, String facilitiesFieldsFullInfo, Facilities facilities) {
        this.facilitiesFieldsId = facilitiesFieldsId;
        this.facilitiesFieldsName = facilitiesFieldsName;
        this.facilitiesFieldsShortInfo = facilitiesFieldsShortInfo;
        this.facilitiesFieldsFullInfo = facilitiesFieldsFullInfo;
        this.facilities = facilities;
    }

    public String getFacilitiesFieldsId() {
        return facilitiesFieldsId;
    }

    public void setFacilitiesFieldsId(String facilitiesFieldsId) {
        this.facilitiesFieldsId = facilitiesFieldsId;
    }

    public String getFacilitiesFieldsName() {
        return facilitiesFieldsName;
    }

    public void setFacilitiesFieldsName(String facilitiesFieldsName) {
        this.facilitiesFieldsName = facilitiesFieldsName;
    }

    public String getFacilitiesFieldsShortInfo() {
        return facilitiesFieldsShortInfo;
    }

    public void setFacilitiesFieldsShortInfo(String facilitiesFieldsShortInfo) {
        this.facilitiesFieldsShortInfo = facilitiesFieldsShortInfo;
    }

    public String getFacilitiesFieldsFullInfo() {
        return facilitiesFieldsFullInfo;
    }

    public void setFacilitiesFieldsFullInfo(String facilitiesFieldsFullInfo) {
        this.facilitiesFieldsFullInfo = facilitiesFieldsFullInfo;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }
}
