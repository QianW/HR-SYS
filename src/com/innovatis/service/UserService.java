package com.innovatis.service;

import java.util.List;

import com.innovatis.model.User;

public interface UserService {
	public void add(User user);
	public boolean delete(User user);
	public boolean update(User user);
	public User getUserById(int id);
	public List<User> getUserByPage(int pageSize,int pageNow,String hql);
	public boolean exists(User user);
}
