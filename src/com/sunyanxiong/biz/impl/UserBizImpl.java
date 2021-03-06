package com.sunyanxiong.biz.impl;

import java.util.List;

import com.sunyanxiong.bean.User;
import com.sunyanxiong.biz.UserBiz;
import com.sunyanxiong.dao.UserDao;
import com.sunyanxiong.dao.impl.UserDaoImpl;

public class UserBizImpl implements UserBiz{

	UserDao userDao = new UserDaoImpl();
	
	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

	@Override
	public int addUser(User u) {
		return userDao.addUser(u);
	}

	@Override
	public int deleteUser(int id) {
		return userDao.deleteUser(id);
	}

	@Override
	public int updateUser(User u) {
		return userDao.updateUser(u);
	}

	@Override
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

}
