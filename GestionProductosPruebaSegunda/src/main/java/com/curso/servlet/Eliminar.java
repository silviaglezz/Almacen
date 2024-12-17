package com.curso.servlet;

import java.io.IOException;

import com.curso.modelo.Producto;
import com.curso.service.ProductoService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Eliminar
 */
public class Eliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductoService service = ProductoService.getInstance();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String nombre = (String) request.getParameter("nombre");
		String categoria = (String) request.getParameter("categoria");
		double precio = Double.parseDouble(request.getParameter("precio"));
		int stock = Integer.parseInt(request.getParameter("stock"));
		
		Producto producto = new Producto(id, nombre, categoria, precio, stock);
		
		if(producto != null) {
			service.eliminarProducto(producto);
		}
		
		RequestDispatcher despachador = request.getRequestDispatcher("eliminar.jsp");
		despachador.forward(request, response);
	}

}
