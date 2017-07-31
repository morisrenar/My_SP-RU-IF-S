package com.smnirjhor.facilities.generics.directors;

import com.smnirjhor.facilities.Facilities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@Entity
public class Directors {
    @Id
    private String facilitiesDirectorsId;
    private String facilitiesDirectorsName;
    private String facilitiesDirectorsEmail;
    private String facilitiesDirectorsPhone;
    private String facilitiesDirectorsRoom;
    private String facilitiesDirectorsInfo;
    private String facilitiesDirectorsPosition;
    private String facilitiesDirectorsPositionName;
    private String facilitiesDirectorsEx1;
    @ManyToOne
    private Facilities facilities;

    public Directors() {
    }

    public Directors(String facilitiesDirectorsId, String facilitiesDirectorsName, String facilitiesDirectorsEmail, String facilitiesDirectorsPhone, String facilitiesDirectorsRoom, String facilitiesDirectorsInfo, String facilitiesDirectorsPosition, String facilitiesDirectorsPositionName, String facilitiesDirectorsEx1, Facilities facilities) {
        this.facilitiesDirectorsId = facilitiesDirectorsId;
        this.facilitiesDirectorsName = facilitiesDirectorsName;
        this.facilitiesDirectorsEmail = facilitiesDirectorsEmail;
        this.facilitiesDirectorsPhone = facilitiesDirectorsPhone;
        this.facilitiesDirectorsRoom = facilitiesDirectorsRoom;
        this.facilitiesDirectorsInfo = facilitiesDirectorsInfo;
        this.facilitiesDirectorsPosition = facilitiesDirectorsPosition;
        this.facilitiesDirectorsPositionName = facilitiesDirectorsPositionName;
        this.facilitiesDirectorsEx1 = facilitiesDirectorsEx1;
        this.facilities = facilities;
    }

    public String getFacilitiesDirectorsId() {
        return facilitiesDirectorsId;
    }

    public void setFacilitiesDirectorsId(String facilitiesDirectorsId) {
        this.facilitiesDirectorsId = facilitiesDirectorsId;
    }

    public String getFacilitiesDirectorsName() {
        return facilitiesDirectorsName;
    }

    public void setFacilitiesDirectorsName(String facilitiesDirectorsName) {
        this.facilitiesDirectorsName = facilitiesDirectorsName;
    }

    public String getFacilitiesDirectorsEmail() {
        return facilitiesDirectorsEmail;
    }

    public void setFacilitiesDirectorsEmail(String facilitiesDirectorsEmail) {
        this.facilitiesDirectorsEmail = facilitiesDirectorsEmail;
    }

    public String getFacilitiesDirectorsPhone() {
        return facilitiesDirectorsPhone;
    }

    public void setFacilitiesDirectorsPhone(String facilitiesDirectorsPhone) {
        this.facilitiesDirectorsPhone = facilitiesDirectorsPhone;
    }

    public String getFacilitiesDirectorsRoom() {
        return facilitiesDirectorsRoom;
    }

    public void setFacilitiesDirectorsRoom(String facilitiesDirectorsRoom) {
        this.facilitiesDirectorsRoom = facilitiesDirectorsRoom;
    }

    public String getFacilitiesDirectorsInfo() {
        return facilitiesDirectorsInfo;
    }

    public void setFacilitiesDirectorsInfo(String facilitiesDirectorsInfo) {
        this.facilitiesDirectorsInfo = facilitiesDirectorsInfo;
    }

    public String getFacilitiesDirectorsPosition() {
        return facilitiesDirectorsPosition;
    }

    public void setFacilitiesDirectorsPosition(String facilitiesDirectorsPosition) {
        this.facilitiesDirectorsPosition = facilitiesDirectorsPosition;
    }

    public String getFacilitiesDirectorsPositionName() {
        return facilitiesDirectorsPositionName;
    }

    public void setFacilitiesDirectorsPositionName(String facilitiesDirectorsPositionName) {
        this.facilitiesDirectorsPositionName = facilitiesDirectorsPositionName;
    }

    public String getFacilitiesDirectorsEx1() {
        return facilitiesDirectorsEx1;
    }

    public void setFacilitiesDirectorsEx1(String facilitiesDirectorsEx1) {
        this.facilitiesDirectorsEx1 = facilitiesDirectorsEx1;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }
}
