package com.sunyanxiong.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sunyanxiong.bean.User;
import com.sunyanxiong.dao.BaseDao;
import com.sunyanxiong.dao.UserDao;

public class UserDaoImpl extends BaseDao implements UserDao{

	Connection con = null;   // 注意在父类BaseDao中定义了一个conn 的变量，所以这个类中不能在定义名为conn 的变量
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	// 查询所有用户信息
	@Override
	public List<User> getAllUser() {
		List<User> list = new ArrayList<User>();
		String sql = "select * from userinfo order by id";
		try {
			con = this.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			User u = null;
			while(rs.next()){
				u = new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setSex(rs.getString("sex"));
				u.setAge(rs.getInt("age"));
				u.setTelephone(rs.getString("telephone"));
				u.setEmail(rs.getString("email"));
				u.setSpecialty(rs.getString("specialty"));
				u.setSchool(rs.getString("school"));
				u.setAddress(rs.getString("address"));
				list.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			this.closeAll(con, pstmt, rs);
		}
		return list;
	}

	// 添加用户
	@Override
	public int addUser(User u) {
		int result = 0;
		String sql = "insert into userinfo(name,sex,age,telephone,email,specialty,school,address) value(?,?,?,?,?,?,?,?)";
		try {
			con = this.getConnection();
			pstmt = con.prepareStatement(sql);
			// pstmt 预编译处理
			pstmt.setString(1, u.getName());
			pstmt.setString(2, u.getSex());
			pstmt.setInt(3, u.getAge());
			pstmt.setString(4, u.getTelephone());
			pstmt.setString(5, u.getEmail());
			pstmt.setString(6, u.getSpecialty());
			pstmt.setString(7, u.getSchool());
			pstmt.setString(8, u.getAddress());
			
			result = pstmt.executeUpdate();
			if(result != 0){
				System.out.println("添加了一条数据");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			this.closeAll(con, pstmt, rs);
		}		
		return result;
	}

	@Override
	public int deleteUser(int id) {
		int result = 0;
		String sql = "delete from userinfo where id=?";
		try {
			con = this.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			result = pstmt.executeUpdate();
			if(result != 0){
				System.out.println("删除了 id 为" + id + "的记录!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
