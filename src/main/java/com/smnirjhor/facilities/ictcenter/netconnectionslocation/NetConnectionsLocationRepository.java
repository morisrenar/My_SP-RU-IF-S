package com.smnirjhor.facilities.ictcenter.netconnectionslocation;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
public interface NetConnectionsLocationRepository extends CrudRepository<NetConnectionsLocation, String> {
    public List<NetConnectionsLocation> findByFacilitiesFacilitiesId(String facilitiesId);
}
