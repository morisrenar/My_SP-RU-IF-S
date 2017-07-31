package com.smnirjhor.facilities.ictcenter.admissionhelpline;

import com.smnirjhor.facilities.Facilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
@RestController
@RequestMapping("/ru/facilities")
public class AdmissionHelplineController {
    @Autowired
    AdmissionHelplineService admissionHelplineService;

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/admissionHelpline")
    public List<AdmissionHelpline> getAllAdmissionHelpline(@PathVariable String facilityId) {
        return admissionHelplineService.getAllAdmissionHelpline(facilityId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/admissionHelpline/{facilitiesAdmissionHelplineId}")
    public AdmissionHelpline getAdmissionHelpline(@PathVariable String facilityId, @PathVariable String facilitiesAdmissionHelplineId) {
        return admissionHelplineService.getAdmissionHelpline(facilityId, facilitiesAdmissionHelplineId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{facilityId}/admissionHelpline")
    public void createAdmissionHelpline(@RequestBody AdmissionHelpline admissionHelpline, @PathVariable String facilityId) {
        admissionHelpline.setFacilities(new Facilities(facilityId, "", ""));
        admissionHelplineService.createAdmissionHelpline(admissionHelpline);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{facilityId}/admissionHelpline/{facilitiesAdmissionHelplineId}")
    public void updateAdmissionHelpline(@RequestBody AdmissionHelpline admissionHelpline, @PathVariable String facilityId, @PathVariable String facilitiesAdmissionHelplineId) {
        admissionHelpline.setFacilities(new Facilities(facilityId, "", ""));
        admissionHelplineService.updateAdmissionHelpline(admissionHelpline);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{facilityId}/admissionHelpline/{facilitiesAdmissionHelplineId}")
    public void deleteAdmissionHelpline(@PathVariable String facilityId, @PathVariable String facilitiesAdmissionHelplineId) {
        admissionHelplineService.deleteAdmissionHelpline(facilitiesAdmissionHelplineId);
    }
}
