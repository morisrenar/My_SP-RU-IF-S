package com.smnirjhor.facilities.generics.fields;

import com.smnirjhor.facilities.Facilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@RestController
@RequestMapping("/ru/facilities")
public class FieldsController {
    @Autowired
    FieldsService fieldsService;

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/fields")
    public List<Fields> getAllFields(@PathVariable String facilityId) {
        return fieldsService.getAllFields(facilityId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/fields/{facilitiesFieldsId}")
    public Fields getFields(@PathVariable String facilityId, @PathVariable String facilitiesFieldsId) {
        return fieldsService.getFields(facilityId, facilitiesFieldsId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{facilityId}/fields")
    public void createFields(@RequestBody Fields fields, @PathVariable String facilityId) {
        fields.setFacilities(new Facilities(facilityId, "", ""));
        fieldsService.createFields(fields);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{facilityId}/fields/{facilitiesFieldsId}")
    public void updateFields(@RequestBody Fields fields, @PathVariable String facilityId, @PathVariable String facilitiesFieldsId) {
        fields.setFacilities(new Facilities(facilityId, "", ""));
        fieldsService.updateFields(fields);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{facilityId}/fields/{facilitiesFieldsId}")
    public void deleteFields(@PathVariable String facilityId, @PathVariable String facilitiesFieldsId) {
        fieldsService.deleteFields(facilitiesFieldsId);
    }

}
