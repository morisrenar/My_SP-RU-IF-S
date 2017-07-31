package com.smnirjhor.facilities.ictcenter.admissionhelpline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
@Service
public class AdmissionHelplineService {
    @Autowired
    AdmissionHelplineRepository admissionHelplineRepository;


    public List<AdmissionHelpline> getAllAdmissionHelpline(String facilityId) {
        return admissionHelplineRepository.findByFacilitiesFacilitiesId(facilityId);
    }

    public AdmissionHelpline getAdmissionHelpline(String facilityId, String facilitiesAdmissionHelplineId) {
        return admissionHelplineRepository.findOne(facilitiesAdmissionHelplineId);
    }

    public void createAdmissionHelpline(AdmissionHelpline admissionHelpline) {
        admissionHelplineRepository.save(admissionHelpline);
    }

    public void updateAdmissionHelpline(AdmissionHelpline admissionHelpline) {
        admissionHelplineRepository.save(admissionHelpline);
    }

    public void deleteAdmissionHelpline(String facilitiesAdmissionHelplineId) {
        admissionHelplineRepository.delete(facilitiesAdmissionHelplineId);
    }
}
