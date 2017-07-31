package com.smnirjhor.facilities.generics.stuffs;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
public interface StuffsRepository extends CrudRepository<Stuffs, String> {
    public List<Stuffs> findByFacilitiesFacilitiesId(String facilitiesId);
}
