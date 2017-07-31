package com.smnirjhor.facilities.generics.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@Service
public class EventsService {
    @Autowired
    EventsRepository eventsRepository;

    public List<Events> getAllEvents(String facilityId) {
        List<Events> events = new ArrayList<>();
        for(Events evnt: eventsRepository.findByFacilitiesFacilitiesId(facilityId)) {
            events.add(evnt);
        }
        return events;
    }

    public Events getEvents(String facilityId, String facilitiesEventsId) {
        return eventsRepository.findOne(facilitiesEventsId);
    }

    public void createEvents(Events events) {
        eventsRepository.save(events);
    }

    public void updateEvents(Events events) {
        eventsRepository.save(events);
    }

    public void deleteEvents(String facilitiesEventsId) {
        eventsRepository.delete(facilitiesEventsId);
    }
}
