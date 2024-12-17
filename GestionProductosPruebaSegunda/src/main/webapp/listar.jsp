<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%@ page import="com.curso.service.ProductoService" %>
<%@ page import="com.curso.modelo.Producto" %>

<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado productos</title>
</head>
<body>
<h1>Listado de los productos</h1>
<%
ProductoService service = ProductoService.getInstance();
List<Producto> productos = service.getProductos();

for(Producto producto: productos){%>
	<p><%=producto.getNombre() %> --- Categoría: <%=producto.getCategoria() %> --- <%=producto.getPrecio() %> € 
		--- Cantidad =  <%=producto.getStock() %></p>
<%} %>
<a href="index.html">Volver al índice</a>
</body>
</html>