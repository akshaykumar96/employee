package com.ibm.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.dao.DepartmentDAO;
import com.ibm.model.Department;


@WebServlet("/departments")
public class DepartmentControllers extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int parameter = Integer.parseInt(request.getParameter("loc"));
		DepartmentDAO dao= new DepartmentDAO();
		ArrayList<Department> depts= dao.getDeptbyLoc(parameter);
		request.setAttribute("depts", depts);
		RequestDispatcher disp= request.getRequestDispatcher("departmentlist2.jsp");
		disp.forward(request, response);
	}

}
