package com.preTraining.epicor;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Model m=new Model();
    /**
     * Default constructor. 
     */
    public FormServlet() {
        // TODO Auto-generated constructor stub
    	System.out.println("In no-arg constructor of FS");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in doGet() of FS");
		FormBean fb=(FormBean)request.getAttribute("form");
		String  res=m.saveToDB(fb);
		RequestDispatcher rd=request.getRequestDispatcher("SampleForm.jsp");
		if(res.equals(Constants.SUCCSESS))
		{
			
			request.setAttribute("res", "Successfully Entered into Database");
			
		}
		else
		{
			request.setAttribute("res", res); 
		}
		rd.forward(request, response);	
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in doPost(0 of FS");
	}

}
