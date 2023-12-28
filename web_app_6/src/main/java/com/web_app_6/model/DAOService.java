package com.web_app_6.model;

import java.sql.ResultSet;

public interface DAOService {
	public void ConnectDB();
	public boolean verifyLogin(String email, String password);
	public void saveRegistration(String name, String city, String email, String mobile);
	public void delete(String email);
	public void updateRegistration(String email, String mobile);
	public ResultSet getALLRegistration();
}
