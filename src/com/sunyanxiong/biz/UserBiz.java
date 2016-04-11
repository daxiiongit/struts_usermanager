package com.sunyanxiong.biz;

import java.util.List;

import com.sunyanxiong.bean.User;

public interface UserBiz {

	public List<User> getAllUser();
	public int addUser(User u);
	
}
