package com.smnirjhor.facilities.generics.events;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
public interface EventsRepository extends CrudRepository<Events, String> {
    public List<Events> findByFacilitiesFacilitiesId(String facilitiesId);
}
