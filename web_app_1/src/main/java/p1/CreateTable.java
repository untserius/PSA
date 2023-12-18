package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateTable")
public class CreateTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CreateTable() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	try {
    		
    		// JDBC connection
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oct_batch_db", "root", "test");
        	Statement stmnt = con.createStatement();
        	ResultSet result = stmnt.executeQuery("Select * from registration");
        	
        	// HTML content creation
        	response.setContentType("text/html");
        	PrintWriter out = response.getWriter();
        	out.println("<table border='1'");
        	out.println("<tr>");
        	out.println("<th style='padding: 0 20px'>");
        	out.println("Name");    	
        	out.println("</th>");
        	out.println("<th style='padding: 0 20px'>");
        	out.println("City");    	
        	out.println("</th>");    	
        	out.println("<th style='padding: 0 20px'>");
        	out.println("Email");    	
        	out.println("</th>");
        	out.println("<th style='padding: 0 20px'>");
        	out.println("Mobile");    	
        	out.println("</th>");    	
        	out.println("</tr>");    	
        	while(result.next()) {
				out.println("<tr>");
	        	out.println("<td style='padding: 0 20px'>");
	        	out.println(result.getString(1));    	
	        	out.println("</td>");
	        	out.println("<td style='padding: 0 20px'>");
	        	out.println(result.getString(2));    	
	        	out.println("</td>");    	
	        	out.println("<td style='padding: 0 20px'>");
	        	out.println(result.getString(3));    	
	        	out.println("</td>");
	        	out.println("<td style='padding: 0 20px'>");
	        	out.println(result.getString(4));    	
	        	out.println("</td>");    	
	        	out.println("</tr>");  
			}
        
        	out.println("</table>");
        	
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
