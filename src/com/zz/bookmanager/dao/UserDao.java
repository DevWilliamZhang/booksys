package com.zz.bookmanager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zz.bookmanager.model.User;

/**
 * 用户dao类
 * @author zhangzhe
 *
 */
public class UserDao {
	public User login(Connection conn,User user) throws Exception {
		User resultUser = null;
		String sql  = "select * from t_user where userName=? and password=?";
		PreparedStatement  pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPassword());
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			resultUser = new User();
			resultUser.setId(rs.getInt("id"));
			resultUser.setUserName(rs.getString("userName"));
			resultUser.setPassword(rs.getString("password"));
		}
		return resultUser;
		
	}
}
