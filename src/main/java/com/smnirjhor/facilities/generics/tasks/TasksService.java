package com.smnirjhor.facilities.generics.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@Service
public class TasksService {
    @Autowired
    TasksRepository tasksRepository;

    public List<Tasks> getAllTasks(String facilityId) {
        List<Tasks> tasks = new ArrayList<>();
        for(Tasks tsk: tasksRepository.findByFacilitiesFacilitiesId(facilityId)) {
            tasks.add(tsk);
        }
        return tasks;
    }

    public Tasks getTasks(String facilityId, String facilitiesTasksId) {
        return tasksRepository.findOne(facilitiesTasksId);
    }

    public void createTasks(Tasks tasks) {
        tasksRepository.save(tasks);
    }

    public void updateTasks(Tasks tasks) {
        tasksRepository.save(tasks);
    }

    public void deleteTasks(String facilitiesTasksId) {
        tasksRepository.delete(facilitiesTasksId);
    }
}
