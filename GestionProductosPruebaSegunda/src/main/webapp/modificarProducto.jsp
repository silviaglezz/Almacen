<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.curso.modelo.Producto" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modificar producto</title>
</head>
<body>
<h1>Modificar producto</h1>
<%
Producto producto = (Producto) request.getAttribute("producto");
%>

	<form action="Modificar" method="post">
		<input type="hidden" name="id" value="<%=producto.getId()%>">
		<br>Nombre: <input type="text" name="nombre" value="<%=producto.getNombre() %>"><br>
		Categoría: <input type="text" name="categoria" value="<%=producto.getCategoria() %>"><br>
		Precio: <input type="number" step="0.01" name="precio" value="<%=producto.getPrecio() %>"><br>
		Stock: <input type="number" name="stock" value="<%=producto.getStock() %>"><br>
		<input type="submit" value="Modificar">
	</form>
 

<br>
<a href="modificar.jsp">Volver a la lista de productos a modificar</a>
</body>
</html>