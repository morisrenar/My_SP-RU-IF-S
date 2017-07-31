package com.smnirjhor.facilities.ictcenter.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
@Service
public class CoursesService {
    @Autowired
    CoursesRepository coursesRepository;

    public List<Courses> getAllCourses(String facilityId) {
        return coursesRepository.findByFacilitiesFacilitiesId(facilityId);
    }


    public Courses getCourses(String facilityId, String facilityCoursesId) {
        return coursesRepository.findOne(facilityCoursesId);
    }

    public void createCourses(String facilityId, Courses courses) {
        coursesRepository.save(courses);
    }

    public void updateCourses(String facilityId, String facilityCoursesId, Courses courses) {
        coursesRepository.save(courses);
    }

    public void deleteCourses(String facilityCoursesId) {
        coursesRepository.delete(facilityCoursesId);
    }
}
