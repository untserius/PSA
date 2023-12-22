package com.web_app_6.model;

import java.sql.*;

public class DAOServiceImpl implements DAOService {

	private Connection con;
	private Statement stmnt;
	
	@Override
	public void ConnectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oct_login_db", "root", "test");
			stmnt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean verifyLogin(String email, String password) {
		try {
			ResultSet result = stmnt.executeQuery("select * from login where username='"+email+"' and password='"+password+"'");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void saveRegistration(String name, String city, String email, String mobile) {
		try {
			stmnt.executeUpdate("insert into registration values('"+name+"', '"+city+"', '"+email+"', '"+mobile+"')");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String email) {

	}

	@Override
	public ResultSet getALLRegistration() {
		try {
			ResultSet result = stmnt.executeQuery("select * from registration");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
