package com.sunyanxiong.dao;

import java.util.List;

import com.sunyanxiong.bean.User;

public interface UserDao {

	public List<User> getAllUser(); // 获取用户信息
	public int addUser(User u);     // 添加用户
	public int deleteUser(int id);   // 删除用户
	
}
