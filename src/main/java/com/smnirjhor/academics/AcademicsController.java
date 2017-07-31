package com.smnirjhor.academics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@RestController
@RequestMapping("/ru")
public class AcademicsController {
    @Autowired
    AcademicsService academicsService;

    @RequestMapping(method = RequestMethod.POST, value = "/academics")
    public void createAcademics(@RequestBody Academics academics) {
        academicsService.createAcademics(academics);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/academics")
    public List<Academics> getAllAcademics() {
        return academicsService.getAllAcademics();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/academics/{academicsId}")
    public Academics getAcademics(@PathVariable String academicsId) {
        return academicsService.getAcadedemics(academicsId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/academics/{academicsId}")
    public void updateAcademics(@RequestBody Academics academics) {
        academicsService.updateAcademics(academics);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/academics/{academicsId}")
    public void deleteAcademics(@PathVariable String academicsId) {
        academicsService.deleteAcademics(academicsId);
    }
}
