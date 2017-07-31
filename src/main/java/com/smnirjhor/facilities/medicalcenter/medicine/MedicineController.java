package com.smnirjhor.facilities.medicalcenter.medicine;

import com.smnirjhor.facilities.Facilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/28/17.
 */
@RestController
@RequestMapping("/ru/facilities")
public class MedicineController {
    @Autowired
    MedicineService medicineService;

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/medicine")
    public List<Medicine> getAllMedicine(@PathVariable String facilityId) {
        return medicineService.getAllMedicine(facilityId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/medicine/{facilitiesMedicineId}")
    public Medicine getMedicine(@PathVariable String facilityId, @PathVariable String facilitiesMedicineId) {
        return medicineService.getMedicine(facilityId, facilitiesMedicineId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{facilityId}/medicine")
    public void createMedicine(@RequestBody Medicine medicine, @PathVariable String facilityId) {
        medicine.setFacilities(new Facilities(facilityId, "", ""));
        medicineService.createMedicine(medicine);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{facilityId}/medicine/{facilitiesMedicineId}")
    public void updateMedicine(@RequestBody Medicine medicine, @PathVariable String facilityId, @PathVariable String facilitiesMedicineId) {
        medicine.setFacilities(new Facilities(facilityId, "", ""));
        medicineService.updateMedicine(medicine);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{facilityId}/medicine/{facilitiesMedicineId}")
    public void deleteMedicine(@PathVariable String facilityId, @PathVariable String facilitiesMedicineId) {
        medicineService.deleteMedicine(facilitiesMedicineId);
    }
}
