package com.smnirjhor.secuirity.users.controller;

import com.smnirjhor.secuirity.users.entity.UserInfo;
import com.smnirjhor.secuirity.users.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/30/17.
 */
@RestController
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @RequestMapping(method = RequestMethod.GET, value = "/users")
    public List<UserInfo> getAllUsers() {
        return userInfoService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/users/{userName}")
    public UserInfo getUsers(@PathVariable String userName) {
        return userInfoService.getUsers(userName);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public void createUsers(@RequestBody UserInfo userInfo) {
        userInfoService.createUsers(userInfo);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/users/{userName}")
    public void updateUsers(@RequestBody UserInfo userInfo, @PathVariable String userName) {
        userInfoService.updateUsers(userInfo);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{userName}")
    public void deleteUsers(@PathVariable String userName) {
        userInfoService.deleteUsers(userName);
    }
}
