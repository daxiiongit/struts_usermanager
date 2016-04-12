package com.sunyanxiong.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.sunyanxiong.bean.User;
import com.sunyanxiong.biz.UserBiz;
import com.sunyanxiong.biz.impl.UserBizImpl;

public class UserAction extends ActionSupport{

	private static final long serialVersionUID = 1L;

	private List<User> list;
	private String[] sexs = new String[]{"男","女"};
	
	private User user;

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}
	
	
	public String[] getSexs() {
		return sexs;
	}

	public void setSexs(String[] sexs) {
		this.sexs = sexs;
	}
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	// 从数据库中获取数据
	public String toList(){
		UserBiz userBiz = new UserBizImpl();
		list = userBiz.getAllUser();
		return "toList";
	}
	
	// 显示添加用户页面
	public String toAdd(){
		
		return "toAdd";
	}
	
	// 添加用户
	public String add(){
		UserBiz userBiz = new UserBizImpl();
		userBiz.addUser(user);
		
		return this.toList(); // 调用toList方法，回到显示页面 
	}
	
	public String delete(){
		UserBiz userBiz = new UserBizImpl();
		userBiz.deleteUser(user.getId());
		return this.toList();
	}
	
	// 修改用户信息的回显逻辑
	public String toUpdate(){
		UserBiz userBiz = new UserBizImpl();
		user = userBiz.getUserById(user.getId());
		return "toUpdate";
	}
	
    // 修改数据 
	public String update(){
		UserBiz userBiz = new UserBizImpl();
		userBiz.updateUser(user);
		return this.toList();
	}
}
