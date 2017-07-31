package com.smnirjhor.facilities.generics.fields;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
public interface FieldsRepository extends CrudRepository<Fields, String> {
    public List<Fields> findByFacilitiesFacilitiesId(String facilitiesId);
}
