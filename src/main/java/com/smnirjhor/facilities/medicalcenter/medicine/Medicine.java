package com.smnirjhor.facilities.medicalcenter.medicine;

import com.smnirjhor.facilities.Facilities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by bmshamsnahid on 7/28/17.
 */
@Entity
public class Medicine {
    @Id
    private String facilitiesMedicineId;
    private String facilitiesMedicineName;
    @ManyToOne
    private Facilities facilities;

    public Medicine() {
    }

    public Medicine(String facilitiesMedicineId, String facilitiesMedicineName, Facilities facilities) {
        this.facilitiesMedicineId = facilitiesMedicineId;
        this.facilitiesMedicineName = facilitiesMedicineName;
        this.facilities = facilities;
    }

    public String getFacilitiesMedicineId() {
        return facilitiesMedicineId;
    }

    public void setFacilitiesMedicineId(String facilitiesMedicineId) {
        this.facilitiesMedicineId = facilitiesMedicineId;
    }

    public String getFacilitiesMedicineName() {
        return facilitiesMedicineName;
    }

    public void setFacilitiesMedicineName(String facilitiesMedicineName) {
        this.facilitiesMedicineName = facilitiesMedicineName;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }
}
