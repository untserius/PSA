package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/verifyLogin")
public class verifyLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public verifyLogin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourlogindb", "root", "test");
			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery("SELECT * FROM login WHERE email='"+email+"' AND PASSWORD='"+password+"'");
			
			if(result.next()) {
				System.out.println("Welcome!");
			} else {
				System.out.println("Invalid emailID/password!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
