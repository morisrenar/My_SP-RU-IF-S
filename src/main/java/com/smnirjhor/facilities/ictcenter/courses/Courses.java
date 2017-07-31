package com.smnirjhor.facilities.ictcenter.courses;

import com.smnirjhor.facilities.Facilities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
@Entity
public class Courses {
    @Id
    private String facilitiesCoursesID;
    private String facilitiesCoursesName;
    @ManyToOne
    private Facilities facilities;

    public Courses() {
    }

    public Courses(String facilitiesCoursesID, String facilitiesCoursesName, Facilities facilities) {
        this.facilitiesCoursesID = facilitiesCoursesID;
        this.facilitiesCoursesName = facilitiesCoursesName;
        this.facilities = facilities;
    }

    public String getFacilitiesCoursesID() {
        return facilitiesCoursesID;
    }

    public void setFacilitiesCoursesID(String facilitiesCoursesID) {
        this.facilitiesCoursesID = facilitiesCoursesID;
    }

    public String getFacilitiesCoursesName() {
        return facilitiesCoursesName;
    }

    public void setFacilitiesCoursesName(String facilitiesCoursesName) {
        this.facilitiesCoursesName = facilitiesCoursesName;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }
}
