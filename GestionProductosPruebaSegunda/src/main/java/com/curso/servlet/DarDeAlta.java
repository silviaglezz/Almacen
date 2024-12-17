package com.curso.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.curso.service.ProductoService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DarDeAlta
 */
public class DarDeAlta extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductoService service = ProductoService.getInstance();

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String categoria = request.getParameter("categoria");
		double precio = Double.parseDouble(request.getParameter("precio"));
		int stock = Integer.parseInt(request.getParameter("stock"));
		
		if(nombre != null && categoria != null && !nombre.isEmpty() && !categoria.isEmpty()) {
			service.añadirProducto(nombre, categoria, precio, stock);
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Dar de alta producto</title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<p>Producto añadido con éxito</p>");
		out.println("<a href='index.html'>Volver al índice</a>");
		
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}

}
