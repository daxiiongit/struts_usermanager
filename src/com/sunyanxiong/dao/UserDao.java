package com.sunyanxiong.dao;

import java.util.List;

import com.sunyanxiong.bean.User;

public interface UserDao {

	public List<User> getAllUser(); // 获取用户信息
	public int addUser(User u);     // 添加用户
	public int deleteUser(int id);   // 删除用户
	public int updateUser(User u);   // 修改数据
	public User getUserById(int id); // 按照主键查找一条数据库中的数据
	
}
