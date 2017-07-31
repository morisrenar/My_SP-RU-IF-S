package com.smnirjhor.academics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@Service
public class AcademicsService {
    @Autowired
    AcademicsRepository academicsRepository;

    public void createAcademics(Academics academics) {
        academicsRepository.save(academics);
    }


    public List<Academics> getAllAcademics() {
        List<Academics> academics = new ArrayList<>();
        for(Academics acadm: academicsRepository.findAll()) {
            academics.add(acadm);
        }
        return academics;
    }

    public Academics getAcadedemics(String academicsId) {
        return academicsRepository.findOne(academicsId);
    }

    public void updateAcademics(Academics academics) {
        academicsRepository.save(academics);
    }

    public void deleteAcademics(String academicsId) {
        academicsRepository.delete(academicsId);
    }
}
