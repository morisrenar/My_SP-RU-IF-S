package com.smnirjhor.facilities.ictcenter.courses;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
public interface CoursesRepository extends CrudRepository<Courses, String> {
    public List<Courses> findByFacilitiesFacilitiesId(String facilitiesId);
}
