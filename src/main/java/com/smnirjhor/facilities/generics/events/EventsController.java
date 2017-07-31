package com.smnirjhor.facilities.generics.events;

import com.smnirjhor.facilities.Facilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@RestController
@RequestMapping("/ru/facilities")
public class EventsController {
    @Autowired
    EventsService eventsService;

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/events")
    public List<Events> getAllEvents(@PathVariable String facilityId) {
        return eventsService.getAllEvents(facilityId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/events/{facilitiesEventsId}")
    public Events getEvents(@PathVariable String facilityId, @PathVariable String facilitiesEventsId) {
        return eventsService.getEvents(facilityId, facilitiesEventsId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{facilityId}/events")
    public void createEvents(@RequestBody Events events, @PathVariable String facilityId) {
        events.setFacilities(new Facilities(facilityId, "", ""));
        eventsService.createEvents(events);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{facilityId}/events/{facilitiesEventsId}")
    public void updateEvents(@RequestBody Events events, @PathVariable String facilityId, @PathVariable String facilitiesEventsId) {
        events.setFacilities(new Facilities(facilityId, "", ""));
        eventsService.updateEvents(events);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{facilityId}/events/{facilitiesEventsId}")
    public void deleteEvents(@PathVariable String facilityId, @PathVariable String facilitiesEventsId) {
        eventsService.deleteEvents(facilitiesEventsId);
    }

}
