package com.innovatis.dao;


import com.innovatis.base.dao.BaseDao;
import com.innovatis.model.User;

public interface UserDao extends BaseDao<User> {

	public boolean hasUser(User user);
	
	

}
