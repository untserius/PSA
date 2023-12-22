package com.web_app_6.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web_app_6.model.DAOServiceImpl;

@WebServlet("/allReg")
public class ReadRegistrationController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    public ReadRegistrationController() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOServiceImpl service = new DAOServiceImpl();
		service.ConnectDB();
		ResultSet result = service.getALLRegistration();
		request.setAttribute("res", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/list_reg.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
