package com.innovatis.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.innovatis.model.User;
import com.innovatis.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Component("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport{
	private String username;
	private String password;
	private User user;
	private UserService userService;
	private String random;
	public String getRandom() {
		return random;
	}
	public void setRandom(String random) {
		this.random = random;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserService getUserService() {
		return userService;
	}
	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String login(){
		User u = new User();
		String random  = (String) ActionContext.getContext().getSession().get("random");
		u.setName(username);
		u.setPassword(password);
		if(this.random.equals(random) && userService.exists(u)){
				return "success";
			}
		else return "login";
	}
}
