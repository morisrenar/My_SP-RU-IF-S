package com.smnirjhor.facilities.transportation;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/28/17.
 */
public interface TransportationInfoRepository extends CrudRepository<TransportationInfo, String> {
    public List<TransportationInfo> findByFacilitiesFacilitiesId(String facilitiesId);
}
