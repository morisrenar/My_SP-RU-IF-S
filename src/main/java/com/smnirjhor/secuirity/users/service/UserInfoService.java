package com.smnirjhor.secuirity.users.service;

import com.smnirjhor.secuirity.users.entity.UserInfo;
import com.smnirjhor.secuirity.users.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bmshamsnahid on 7/30/17.
 */
@Service
public class UserInfoService {
    @Autowired
    UserInfoRepository userInfoRepository;

    public List<UserInfo> getAllUsers() {
        List<UserInfo> userInfos = new ArrayList<>();
        for(UserInfo ui: userInfoRepository.findAll()) {
            userInfos.add(ui);
        }
        return userInfos;
    }

    public UserInfo getUsers(String userName) {
        return userInfoRepository.findOne(userName);
    }

    public void createUsers(UserInfo userInfo) {
        userInfoRepository.save(userInfo);
    }

    public void updateUsers(UserInfo userInfo) {
        userInfoRepository.save(userInfo);
    }

    public void deleteUsers(String userName) {
        userInfoRepository.delete(userName);
    }
}
