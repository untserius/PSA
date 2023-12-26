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


@WebServlet("/updateRegistration")
public class UpdateRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateRegistrationController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		try {
			DAOServiceImpl service = new DAOServiceImpl();
			service.ConnectDB();
			service.update(email, mobile);
			
			request.setAttribute("email", email);
			request.setAttribute("mobile", mobile);
			
			System.out.println(request.getAttribute("email"));
			System.out.println(request.getAttribute("mobile"));
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/update_reg.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
