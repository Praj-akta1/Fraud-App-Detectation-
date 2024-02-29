package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.bean.AddBean;
import com.bean.UserBean;
import com.connection.DBConnection;

public class AdminDao {
	Connection connection=null;
	Boolean resultStatus=Boolean.FALSE;
	PreparedStatement ps;
	ResultSet rs;
    Statement st=null;
	public ArrayList<UserBean> getFriend(String friendname) throws SQLException
	{
		
		String sql="select * from tbl_user where name=?";
		connection=DBConnection.getConnection();
		ps=connection.prepareStatement(sql);
		ps.setString(1, friendname);
		ArrayList<UserBean> friendList=new ArrayList<UserBean>();
		rs=ps.executeQuery();
		while(rs.next())
		{
			UserBean bean=new UserBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setAddress(rs.getString(3));
			bean.setEmail(rs.getString(4));
			bean.setMobileno(rs.getString(5));
			bean.setImage(rs.getBinaryStream(8));
		friendList.add(bean);
		}
		return friendList;
		
	}
	
	
	public boolean InsertAPPData(AddBean userbean) {
		 
		String sql = "insert into tbl_app(name,type,image) values(?,?,?) ";

		Connection con = DBConnection.getConnection();

		try {
			ps = con.prepareStatement(sql);

			
			ps.setString(1, userbean.getLoc_name());
			ps.setString(2, userbean.getLoc_type());
			ps.setBlob(3, userbean.getImage());
			
			
			int index = ps.executeUpdate();

			if (index > 0) {
				resultStatus = true;
			} else {
				resultStatus = false;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return resultStatus;
	}
	
	
}
