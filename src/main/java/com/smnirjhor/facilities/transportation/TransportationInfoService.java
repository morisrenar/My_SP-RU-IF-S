package com.smnirjhor.facilities.transportation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/28/17.
 */
@Service
public class TransportationInfoService {
    @Autowired
    TransportationInfoRepository transportationInfoRepository;

    public List<TransportationInfo> getAllTransportationInfo(String facilityId) {
        return transportationInfoRepository.findByFacilitiesFacilitiesId(facilityId);
    }


    public TransportationInfo getTransportationInfo(String facilityId, String facilitiesTransportationInfoId) {
        return transportationInfoRepository.findOne(facilitiesTransportationInfoId);
    }

    public void createTransportationInfo(TransportationInfo transportationInfo) {
        transportationInfoRepository.save(transportationInfo);
    }

    public void updateTransportationInfo(TransportationInfo transportationInfo) {
        transportationInfoRepository.save(transportationInfo);
    }


    public void deleteTransportationInfo(String facilitiesTransportationInfoId) {
        transportationInfoRepository.delete(facilitiesTransportationInfoId);
    }
}
