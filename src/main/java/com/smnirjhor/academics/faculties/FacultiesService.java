package com.smnirjhor.academics.faculties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@Service
public class FacultiesService {
    @Autowired
    FacultiesRepository facultiesRepository;

    public void createFaculties(Faculties faculties) {
        facultiesRepository.save(faculties);
    }

    public List<Faculties> getAllFaculties(String academicsId) {
        List<Faculties> faculties = new ArrayList<>();
        for(Faculties flty: facultiesRepository.findByAcademicsAcademicsId(academicsId)) {
            faculties.add(flty);
        }
        return faculties;
    }

    public Faculties getFaculties(String academicsId, String academicsFacultiesId) {
        return facultiesRepository.findOne(academicsFacultiesId);
    }

    public void updateFaculties(Faculties faculties) {
        facultiesRepository.save(faculties);
    }

    public void deleteFaculties(String academicsFacultiesId) {
        facultiesRepository.delete(academicsFacultiesId);
    }
}
