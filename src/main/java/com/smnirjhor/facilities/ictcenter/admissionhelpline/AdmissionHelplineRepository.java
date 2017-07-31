package com.smnirjhor.facilities.ictcenter.admissionhelpline;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
public interface AdmissionHelplineRepository extends CrudRepository<AdmissionHelpline, String> {
    public List<AdmissionHelpline> findByFacilitiesFacilitiesId(String facilitiesId);
}
