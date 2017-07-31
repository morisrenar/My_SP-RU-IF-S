package com.smnirjhor.facilities.ictcenter.netconnectionslocation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
@Service
public class NetConnectionsLocationService {
    @Autowired
    NetConnectionsLocationRepository netConnectionsLocationRepository;


    public List<NetConnectionsLocation> getAllNetConnectionsLocation(String facilityId) {
        return netConnectionsLocationRepository.findByFacilitiesFacilitiesId(facilityId);
    }


    public NetConnectionsLocation getNetConnectionsLocation(String facilityId, String facilitiesNetConnectionsLocationId) {
        return netConnectionsLocationRepository.findOne(facilitiesNetConnectionsLocationId);
    }


    public void createNetConnectionsLocation(NetConnectionsLocation netConnectionsLocation) {
        netConnectionsLocationRepository.save(netConnectionsLocation);
    }

    public void updateNetConnectionsLocation(NetConnectionsLocation netConnectionsLocation) {
        netConnectionsLocationRepository.save(netConnectionsLocation);
    }

    public void deleteNetConnectionsLocation(String facilitiesnetConnectionsLocationId) {
        netConnectionsLocationRepository.delete(facilitiesnetConnectionsLocationId);
    }
}
