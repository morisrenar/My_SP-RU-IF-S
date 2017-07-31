package com.smnirjhor.facilities.medicalcenter.medicine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/28/17.
 */
@Service
public class MedicineService {
    @Autowired
    MedicineRepository medicineRepository;

    public List<Medicine> getAllMedicine(String facilityId) {
        return medicineRepository.findByFacilitiesFacilitiesId(facilityId);
    }

    public Medicine getMedicine(String facilityId, String facilitiesMedicineId) {
        return medicineRepository.findOne(facilitiesMedicineId);
    }

    public void createMedicine(Medicine medicine) {
        medicineRepository.save(medicine);
    }

    public void updateMedicine(Medicine medicine) {
        medicineRepository.save(medicine);
    }

    public void deleteMedicine(String facilitiesMedicineId) {
        medicineRepository.delete(facilitiesMedicineId);
    }
}
