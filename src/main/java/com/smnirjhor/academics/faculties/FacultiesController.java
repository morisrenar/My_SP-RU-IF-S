package com.smnirjhor.academics.faculties;

import com.smnirjhor.academics.Academics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@RestController
@RequestMapping("/ru/academics")
public class FacultiesController {
    @Autowired
    FacultiesService facultiesService;

    @RequestMapping(method = RequestMethod.POST, value = "/{academicsId}/faculties")
    public void createFaculties(@RequestBody Faculties faculties, @PathVariable String academicsId) {
        faculties.setAcademics(new Academics(academicsId, "", ""));
        facultiesService.createFaculties(faculties);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{academicsId}/faculties")
    public List<Faculties> getAllFaculties(@PathVariable String academicsId) {
        return facultiesService.getAllFaculties(academicsId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{academicsId}/faculties/{academicsFacultiesId}")
    public Faculties getAllFaculties(@PathVariable String academicsId, @PathVariable String academicsFacultiesId) {
        return facultiesService.getFaculties(academicsId, academicsFacultiesId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{academicsId}/faculties/{academicsFacultiesId}")
    public void updateFaculties(@RequestBody Faculties faculties, @PathVariable String academicsId, @PathVariable String academicsFacultiesId) {
        faculties.setAcademics(new Academics(academicsId, "", ""));
        facultiesService.updateFaculties(faculties);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{academicsId}/faculties/{academicsFacultiesId}")
    public void deleteFaculties(@PathVariable String academicsId, @PathVariable String academicsFacultiesId) {
        facultiesService.deleteFaculties(academicsFacultiesId);
    }

}
