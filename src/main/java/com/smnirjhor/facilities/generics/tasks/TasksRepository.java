package com.smnirjhor.facilities.generics.tasks;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
public interface TasksRepository extends CrudRepository<Tasks, String> {
    public List<Tasks> findByFacilitiesFacilitiesId(String facilitiesId);
}
