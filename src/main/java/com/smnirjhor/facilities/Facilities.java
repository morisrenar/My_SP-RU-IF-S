package com.smnirjhor.facilities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by bmshamsnahid on 7/24/17.
 */
@Entity
public class Facilities {

    @Id
    private String facilitiesId;
    private String facilitiesName;
    private String facilitiesInfo;

    public Facilities() {
    }

    public Facilities(String facilitiesId, String facilitiesName, String facilitiesInfo) {
        this.facilitiesId = facilitiesId;
        this.facilitiesName = facilitiesName;
        this.facilitiesInfo = facilitiesInfo;
    }

    public String getFacilitiesId() {
        return facilitiesId;
    }

    public void setFacilitiesId(String facilitiesId) {
        this.facilitiesId = facilitiesId;
    }

    public String getFacilitiesName() {
        return facilitiesName;
    }

    public void setFacilitiesName(String facilitiesName) {
        this.facilitiesName = facilitiesName;
    }

    public String getFacilitiesInfo() {
        return facilitiesInfo;
    }

    public void setFacilitiesInfo(String facilitiesInfo) {
        this.facilitiesInfo = facilitiesInfo;
    }
}
