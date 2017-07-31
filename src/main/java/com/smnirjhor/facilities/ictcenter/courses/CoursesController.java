package com.smnirjhor.facilities.ictcenter.courses;

import com.smnirjhor.facilities.Facilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
@RestController
@RequestMapping("/ru/facilities")
public class CoursesController {
    @Autowired
    CoursesService coursesService;

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/courses")
    public List<Courses> getAllCourses(@PathVariable String facilityId) {
        return coursesService.getAllCourses(facilityId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/courses/{facilityCoursesId}")
    public Courses getCourses(@PathVariable String facilityId, @PathVariable String facilityCoursesId) {
        return coursesService.getCourses(facilityId, facilityCoursesId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{facilityId}/courses")
    public void createCourses(@RequestBody Courses courses, @PathVariable String facilityId) {
        courses.setFacilities(new Facilities(facilityId, "", ""));
        coursesService.createCourses(facilityId, courses);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{facilityId}/courses/{facilityCoursesId}")
    public void updateCourses(@RequestBody Courses courses, @PathVariable String facilityId, @PathVariable String facilityCoursesId) {
        courses.setFacilities(new Facilities(facilityId, "", ""));
        coursesService.updateCourses(facilityId, facilityCoursesId, courses);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{facilityId}/courses/{facilityCoursesId}")
    public void deleteCourses(@PathVariable String facilityCoursesId) {
        coursesService.deleteCourses(facilityCoursesId);
    }

}
