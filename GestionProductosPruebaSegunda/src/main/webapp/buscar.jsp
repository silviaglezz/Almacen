<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.curso.service.ProductoService" %>
<%@ page import="com.curso.modelo.Producto" %>

<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buscador de productos</title>
</head>
<body>
<h1>Buscador de productos por categoría</h1>
<%
ProductoService service = new ProductoService();
List<Producto> productos = service.obtenerCategorias();
%>

<form action="buscarProductos.jsp" method="post">
	<select name="categoria">
	<%for(Producto producto: productos){%>
		<option value="<%=producto.getCategoria() %>"><%=producto.getCategoria() %></option>
	<%}%>		
	</select>
	<input type="submit" value="Buscar">
</form><br>

<a href="index.html">Volver al índice</a>

</body>
</html>