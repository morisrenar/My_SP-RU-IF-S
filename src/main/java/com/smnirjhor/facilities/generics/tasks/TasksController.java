package com.smnirjhor.facilities.generics.tasks;

import com.smnirjhor.facilities.Facilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@RestController
@RequestMapping("/ru/facilities")
public class TasksController {
    @Autowired
    TasksService tasksService;

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/tasks")
    public List<Tasks> getAllTasks(@PathVariable String facilityId) {
        return tasksService.getAllTasks(facilityId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{facilityId}/tasks/{facilitiesTasksId}")
    public Tasks getTasks(@PathVariable String facilityId, @PathVariable String facilitiesTasksId) {
        return tasksService.getTasks(facilityId, facilitiesTasksId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{facilityId}/tasks")
    public void createTasks(@RequestBody Tasks tasks, @PathVariable String facilityId) {
        tasks.setFacilities(new Facilities(facilityId, "", ""));
        tasksService.createTasks(tasks);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{facilityId}/tasks/{facilitiesTasksId}")
    public void updateTasks(@RequestBody Tasks tasks, @PathVariable String facilityId, @PathVariable String facilitiesTasksId) {
        tasks.setFacilities(new Facilities(facilityId, "", ""));
        tasksService.updateTasks(tasks);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{facilityId}/tasks/{facilitiesTasksId}")
    public void deleteTasks(@PathVariable String facilityId, @PathVariable String facilitiesTasksId) {
        tasksService.deleteTasks(facilitiesTasksId);
    }
}
