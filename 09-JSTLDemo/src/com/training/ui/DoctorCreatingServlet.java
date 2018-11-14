package com.training.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.w3c.dom.views.DocumentView;

import com.training.entity.Doctor;

/**
 * Servlet implementation class DoctorCreatingServlet
 */
@WebServlet("/DoctorCreatingServlet")
public class DoctorCreatingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Doctor doctor=new Doctor();
		Doctor doctor1=new Doctor();
		Doctor doctor2=new Doctor();
		Doctor doctor3=new Doctor();
		Doctor doctor4=new Doctor();
		
				doctor.setId(591);
				doctor.setGender("FEMALE");
				doctor.setExperience(5);
				doctor.setFee(1500);
				doctor.setName("prasanna");
				doctor.setQualification("MD FRCS Londan");
				request.setAttribute("DOC",doctor);
				
				doctor1.setId(592);
				doctor1.setGender("FEMALE");
				doctor1.setExperience(5);
				doctor1.setFee(1000);
				doctor1.setName("Lakshmi");
				doctor1.setQualification("MD ");
				request.setAttribute("DOC",doctor);
				
				doctor2.setId(593);
				doctor2.setGender("MALE");
				doctor2.setExperience(5);
				doctor2.setFee(500);
				doctor2.setName("Ravi");
				doctor2.setQualification("M.B.B.S");
				request.setAttribute("DOC",doctor);
				
				doctor3.setId(594);
				doctor3.setGender("MALE");
				doctor3.setExperience(5);
				doctor3.setFee(700);
				doctor3.setName("Chandu");
				doctor3.setQualification("MD ");
				request.setAttribute("DOC",doctor);
				
				doctor4.setId(595);
				doctor4.setGender("MALE");
				doctor4.setExperience(5);
				doctor4.setFee(800);
				doctor4.setName("Naveen");
				doctor4.setQualification("M.B.B.S");
				request.setAttribute("DOC",doctor);
	List<Doctor> doctors =new ArrayList<>();
	
	doctors.add(doctor);
	doctors.add(doctor1);
	doctors.add(doctor2);
	doctors.add(doctor3);
	doctors.add(doctor4);
	request.setAttribute("DOCTORS",doctors);
	
	
	RequestDispatcher dispatcher=request.getRequestDispatcher("Display4.jsp");
	dispatcher.forward(request, response);
	
	}

}
