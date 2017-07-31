package com.smnirjhor.secuirity.users.dao;

import com.smnirjhor.secuirity.users.entity.UserInfo;

public interface IUserInfoDAO {
	UserInfo getActiveUser(String userName);
}