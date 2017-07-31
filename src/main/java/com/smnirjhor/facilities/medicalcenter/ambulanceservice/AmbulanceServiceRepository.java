package com.smnirjhor.facilities.medicalcenter.ambulanceservice;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/28/17.
 */
public interface AmbulanceServiceRepository extends CrudRepository<AmbulanceService, String> {
    public List<AmbulanceService> findByFacilitiesFacilitiesId(String facilitiesId);
}
