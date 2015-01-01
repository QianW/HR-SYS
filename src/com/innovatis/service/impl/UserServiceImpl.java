package com.innovatis.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.innovatis.dao.UserDao;
import com.innovatis.model.User;
import com.innovatis.service.UserService;

@Component("userService")
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	
	public UserDao getUserDao() {
		return userDao;
	}

	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void add(User user) {
		userDao.save(user);
	}

	

	@Override
	public boolean delete(User user) {
		User u = getUserById(user.getId());
		if(u!=null){
			userDao.delete(u);
			return true;
		} else return false;
		
	}

	@Override
	public boolean update(User user) {
		if(user!=null){
			userDao.update(user);
			return true;
		} else return false;
	}

	@Override
	public User getUserById(int id) {
		User u = new User();
		u = (User) userDao.findById(User.class, id);
		return u;
	}

	@Override
	public List<User> getUserByPage(int pageSize, int pageNow,String hql) {
		List<User> results = userDao.findByPage(pageSize, pageNow, hql);
		return results;
	}

	@Override
	public boolean exists(User user) {
		if(userDao.hasUser(user)) return true;
		return false;
	}

}
