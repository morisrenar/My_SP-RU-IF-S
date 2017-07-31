package com.smnirjhor.facilities.generics.stuffs;

import com.smnirjhor.facilities.Facilities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@Entity
public class Stuffs {
    @Id
    private String facilitiesStuffsId;
    private String facilitiesStuffsName;
    private String facilitiesStuffsEmail;
    private String facilitiesStuffsPhone;
    private String facilitiesStuffsRoom;
    private String facilitiesStuffsInfo;
    private String facilitiesStuffsPosition;
    private String facilitiesStuffsPositionName;
    private String facilitiesStuffsEx1;
    @ManyToOne
    private Facilities facilities;

    public Stuffs() {
    }

    public Stuffs(String facilitiesStuffsId, String facilitiesStuffsName, String facilitiesStuffsEmail, String facilitiesStuffsPhone, String facilitiesStuffsRoom, String facilitiesStuffsInfo, String facilitiesStuffsPosition, String facilitiesStuffsPositionName, String facilitiesStuffsEx1, Facilities facilities) {
        this.facilitiesStuffsId = facilitiesStuffsId;
        this.facilitiesStuffsName = facilitiesStuffsName;
        this.facilitiesStuffsEmail = facilitiesStuffsEmail;
        this.facilitiesStuffsPhone = facilitiesStuffsPhone;
        this.facilitiesStuffsRoom = facilitiesStuffsRoom;
        this.facilitiesStuffsInfo = facilitiesStuffsInfo;
        this.facilitiesStuffsPosition = facilitiesStuffsPosition;
        this.facilitiesStuffsPositionName = facilitiesStuffsPositionName;
        this.facilitiesStuffsEx1 = facilitiesStuffsEx1;
        this.facilities = facilities;
    }

    public String getFacilitiesStuffsId() {
        return facilitiesStuffsId;
    }

    public void setFacilitiesStuffsId(String facilitiesStuffsId) {
        this.facilitiesStuffsId = facilitiesStuffsId;
    }

    public String getFacilitiesStuffsName() {
        return facilitiesStuffsName;
    }

    public void setFacilitiesStuffsName(String facilitiesStuffsName) {
        this.facilitiesStuffsName = facilitiesStuffsName;
    }

    public String getFacilitiesStuffsEmail() {
        return facilitiesStuffsEmail;
    }

    public void setFacilitiesStuffsEmail(String facilitiesStuffsEmail) {
        this.facilitiesStuffsEmail = facilitiesStuffsEmail;
    }

    public String getFacilitiesStuffsPhone() {
        return facilitiesStuffsPhone;
    }

    public void setFacilitiesStuffsPhone(String facilitiesStuffsPhone) {
        this.facilitiesStuffsPhone = facilitiesStuffsPhone;
    }

    public String getFacilitiesStuffsRoom() {
        return facilitiesStuffsRoom;
    }

    public void setFacilitiesStuffsRoom(String facilitiesStuffsRoom) {
        this.facilitiesStuffsRoom = facilitiesStuffsRoom;
    }

    public String getFacilitiesStuffsInfo() {
        return facilitiesStuffsInfo;
    }

    public void setFacilitiesStuffsInfo(String facilitiesStuffsInfo) {
        this.facilitiesStuffsInfo = facilitiesStuffsInfo;
    }

    public String getFacilitiesStuffsPosition() {
        return facilitiesStuffsPosition;
    }

    public void setFacilitiesStuffsPosition(String facilitiesStuffsPosition) {
        this.facilitiesStuffsPosition = facilitiesStuffsPosition;
    }

    public String getFacilitiesStuffsPositionName() {
        return facilitiesStuffsPositionName;
    }

    public void setFacilitiesStuffsPositionName(String facilitiesStuffsPositionName) {
        this.facilitiesStuffsPositionName = facilitiesStuffsPositionName;
    }

    public String getFacilitiesStuffsEx1() {
        return facilitiesStuffsEx1;
    }

    public void setFacilitiesStuffsEx1(String facilitiesStuffsEx1) {
        this.facilitiesStuffsEx1 = facilitiesStuffsEx1;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }
}
