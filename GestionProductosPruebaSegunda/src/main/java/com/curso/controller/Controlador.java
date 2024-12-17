package com.curso.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controlador
 */
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String option = request.getParameter("option");
		String urlVista = "/";
		
		switch(option) {
		case "alta":
			urlVista = "alta.html";
			break;
		case "eliminar":
			urlVista = "eliminar.jsp";
			break;
		case "modificar":
			urlVista = "modificar.jsp";
			break;
		case "buscar":
			urlVista = "buscar.jsp";
			break;
		case "listar":
			urlVista = "listar.jsp";
			break;
		}
		
		RequestDispatcher despachador = request.getRequestDispatcher(urlVista);
		despachador.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
