package com.smnirjhor.facilities.generics.schedulings;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
public interface SchedulingsRepository extends CrudRepository<Schedulings, String> {
    public List<Schedulings> findByFacilitiesFacilitiesId(String facilitiesId);
}
