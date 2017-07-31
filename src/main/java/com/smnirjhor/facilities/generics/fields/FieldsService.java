package com.smnirjhor.facilities.generics.fields;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@Service
public class FieldsService {
    @Autowired
    FieldsRepository fieldsRepository;

    public List<Fields> getAllFields(String facilityId) {
        List<Fields> fields = new ArrayList<>();
        for(Fields fld: fieldsRepository.findByFacilitiesFacilitiesId(facilityId)) {
            fields.add(fld);
        }
        return fields;
    }


    public Fields getFields(String facilityId, String facilitiesFieldsId) {
        return fieldsRepository.findOne(facilitiesFieldsId);
    }

    public void createFields(Fields fields) {
        fieldsRepository.save(fields);
    }

    public void updateFields(Fields fields) {
        fieldsRepository.save(fields);
    }


    public void deleteFields(String facilitiesFieldsId) {
        fieldsRepository.delete(facilitiesFieldsId);
    }
}
