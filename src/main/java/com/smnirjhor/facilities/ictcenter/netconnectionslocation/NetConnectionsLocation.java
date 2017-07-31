package com.smnirjhor.facilities.ictcenter.netconnectionslocation;

import com.smnirjhor.facilities.Facilities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
@Entity
public class NetConnectionsLocation {
    @Id
    private String facilitiesNetConnectionsLocationId;
    private String facilitiesNetConnectionsLocationName;
    @ManyToOne
    private Facilities facilities;

    public NetConnectionsLocation() {
    }

    public NetConnectionsLocation(String facilitiesNetConnectionsLocationId, String facilitiesNetConnectionsLocationName, Facilities facilities) {
        this.facilitiesNetConnectionsLocationId = facilitiesNetConnectionsLocationId;
        this.facilitiesNetConnectionsLocationName = facilitiesNetConnectionsLocationName;
        this.facilities = facilities;
    }

    public String getFacilitiesNetConnectionsLocationId() {
        return facilitiesNetConnectionsLocationId;
    }

    public void setFacilitiesNetConnectionsLocationId(String facilitiesNetConnectionsLocationId) {
        this.facilitiesNetConnectionsLocationId = facilitiesNetConnectionsLocationId;
    }

    public String getFacilitiesNetConnectionsLocationName() {
        return facilitiesNetConnectionsLocationName;
    }

    public void setFacilitiesNetConnectionsLocationName(String facilitiesNetConnectionsLocationName) {
        this.facilitiesNetConnectionsLocationName = facilitiesNetConnectionsLocationName;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }
}
