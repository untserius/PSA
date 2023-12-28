package com.web_app_6.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web_app_6.model.DAOServiceImpl;

@WebServlet("/verifyLogin")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		DAOServiceImpl service = new DAOServiceImpl();
		service.ConnectDB();
		boolean status = service.verifyLogin(email, password);
		if(status) {
			HttpSession ss = request.getSession(true);
			ss.setAttribute("email", email);
			ss.setMaxInactiveInterval(10);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/student_enquiry.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("error", "Invalid username/password");
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
		
	}
}
