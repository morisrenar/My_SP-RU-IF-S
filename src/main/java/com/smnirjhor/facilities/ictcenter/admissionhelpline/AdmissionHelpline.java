package com.smnirjhor.facilities.ictcenter.admissionhelpline;

import com.smnirjhor.facilities.Facilities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
@Entity
public class AdmissionHelpline {
    @Id
    private String facilitiesAdmissionHelplineId;
    private String facilitiesAdmissionHelplineInformation;
    @ManyToOne
    private Facilities facilities;

    public AdmissionHelpline() {
    }

    public AdmissionHelpline(String facilitiesAdmissionHelplineId, String facilitiesAdmissionHelplineInformation, Facilities facilities) {
        this.facilitiesAdmissionHelplineId = facilitiesAdmissionHelplineId;
        this.facilitiesAdmissionHelplineInformation = facilitiesAdmissionHelplineInformation;
        this.facilities = facilities;
    }

    public String getFacilitiesAdmissionHelplineId() {
        return facilitiesAdmissionHelplineId;
    }

    public void setFacilitiesAdmissionHelplineId(String facilitiesAdmissionHelplineId) {
        this.facilitiesAdmissionHelplineId = facilitiesAdmissionHelplineId;
    }

    public String getFacilitiesAdmissionHelplineInformation() {
        return facilitiesAdmissionHelplineInformation;
    }

    public void setFacilitiesAdmissionHelplineInformation(String facilitiesAdmissionHelplineInformation) {
        this.facilitiesAdmissionHelplineInformation = facilitiesAdmissionHelplineInformation;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }
}
