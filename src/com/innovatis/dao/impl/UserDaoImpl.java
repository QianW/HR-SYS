package com.innovatis.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.innovatis.base.dao.impl.BaseDaoImpl;
import com.innovatis.dao.UserDao;
import com.innovatis.model.User;

@Component("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{
	

	@Override
	public boolean hasUser(User user) {
		String name = user.getName();
		String password = user.getPassword();
		List<User> users = getHibernateTemplate().find("from User u where u.name='"+name+"' and u.password='"+password+"'");
		if (users.size()!=0) return true;
		return false;
	}

	
}
