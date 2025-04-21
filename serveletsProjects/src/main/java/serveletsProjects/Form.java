package serveletsProjects;
import jakarta.servlet.*;
import java.io.*;
import jakarta.servlet.http.*;
import java.sql.*;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Form extends HttpServlet {
Connection con;   
Statement st;
ResultSet rs;
String nme;
int mobNo;
String adrs;
public void itin()
{
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost/joins","root","tiwari");
	st=con.createStatement();
}
catch(Exception e)
{
	System.out.println(e);
}
}
 public void doGet(HttpServletRequest req,HttpServletResponse nm,HttpServletResponse ph,HttpServletResponse adr)throws ServletException,IOException
 {
	 nm.setContentType("txt/html");
	 PrintWriter pw=nm.getWriter();
	 ph.setContentType("phoneNumber/html");
	 PrintWriter pho=ph.getWriter();
	 adr.setContentType("adress/html");
	 PrintWriter adrs=adr.getWriter(); 
	 
 }
  

}
