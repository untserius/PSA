package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteReg")
public class DeleteRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	// Default Constructor
    public DeleteRegistration() {
        super();
    }

    // Method - Get
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
//		System.out.println("Get");
	}

	// Method - Post
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String email = request.getParameter("email");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oct_batch_db", "root", "test");
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("Delete from registration where email='"+email+"'");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		System.out.println(name);
//		System.out.println(mobile);
//		System.out.println(email);
//		System.out.println(address);
	}

}
