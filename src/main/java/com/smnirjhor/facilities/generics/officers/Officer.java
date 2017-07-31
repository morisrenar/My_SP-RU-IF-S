package com.smnirjhor.facilities.generics.officers;

import com.smnirjhor.facilities.Facilities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@Entity
public class Officer {

    @Id
    private String facilitiesOfficersId;
    private String facilitiesOfficersName;
    private String facilitiesOfficersEmail;
    private String facilitiesOfficersPhone;
    private String facilitiesOfficersRoom;
    private String facilitiesOfficersInfo;
    private String facilitiesOfficersPosition;
    private String facilitiesOfficersPositionName;
    private String facilitiesOfficersEx1;
    @ManyToOne
    private Facilities facilities;

    public Officer() {
    }

    public Officer(String facilitiesOfficersId, String facilitiesOfficersName, String facilitiesOfficersEmail, String facilitiesOfficersPhone, String facilitiesOfficersRoom, String facilitiesOfficersInfo, String facilitiesOfficersPosition, String facilitiesOfficersPositionName, String facilitiesOfficersEx1, Facilities facilities) {
        this.facilitiesOfficersId = facilitiesOfficersId;
        this.facilitiesOfficersName = facilitiesOfficersName;
        this.facilitiesOfficersEmail = facilitiesOfficersEmail;
        this.facilitiesOfficersPhone = facilitiesOfficersPhone;
        this.facilitiesOfficersRoom = facilitiesOfficersRoom;
        this.facilitiesOfficersInfo = facilitiesOfficersInfo;
        this.facilitiesOfficersPosition = facilitiesOfficersPosition;
        this.facilitiesOfficersPositionName = facilitiesOfficersPositionName;
        this.facilitiesOfficersEx1 = facilitiesOfficersEx1;
        this.facilities = facilities;
    }

    public String getFacilitiesOfficersId() {
        return facilitiesOfficersId;
    }

    public void setFacilitiesOfficersId(String facilitiesOfficersId) {
        this.facilitiesOfficersId = facilitiesOfficersId;
    }

    public String getFacilitiesOfficersName() {
        return facilitiesOfficersName;
    }

    public void setFacilitiesOfficersName(String facilitiesOfficersName) {
        this.facilitiesOfficersName = facilitiesOfficersName;
    }

    public String getFacilitiesOfficersEmail() {
        return facilitiesOfficersEmail;
    }

    public void setFacilitiesOfficersEmail(String facilitiesOfficersEmail) {
        this.facilitiesOfficersEmail = facilitiesOfficersEmail;
    }

    public String getFacilitiesOfficersPhone() {
        return facilitiesOfficersPhone;
    }

    public void setFacilitiesOfficersPhone(String facilitiesOfficersPhone) {
        this.facilitiesOfficersPhone = facilitiesOfficersPhone;
    }

    public String getFacilitiesOfficersRoom() {
        return facilitiesOfficersRoom;
    }

    public void setFacilitiesOfficersRoom(String facilitiesOfficersRoom) {
        this.facilitiesOfficersRoom = facilitiesOfficersRoom;
    }

    public String getFacilitiesOfficersInfo() {
        return facilitiesOfficersInfo;
    }

    public void setFacilitiesOfficersInfo(String facilitiesOfficersInfo) {
        this.facilitiesOfficersInfo = facilitiesOfficersInfo;
    }

    public String getFacilitiesOfficersPosition() {
        return facilitiesOfficersPosition;
    }

    public void setFacilitiesOfficersPosition(String facilitiesOfficersPosition) {
        this.facilitiesOfficersPosition = facilitiesOfficersPosition;
    }

    public String getFacilitiesOfficersPositionName() {
        return facilitiesOfficersPositionName;
    }

    public void setFacilitiesOfficersPositionName(String facilitiesOfficersPositionName) {
        this.facilitiesOfficersPositionName = facilitiesOfficersPositionName;
    }

    public String getFacilitiesOfficersEx1() {
        return facilitiesOfficersEx1;
    }

    public void setFacilitiesOfficersEx1(String facilitiesOfficersEx1) {
        this.facilitiesOfficersEx1 = facilitiesOfficersEx1;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }
}
