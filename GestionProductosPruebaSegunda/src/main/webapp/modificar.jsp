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
<title>Modificar productos</title>
</head>
<body>
<h1>Selecciona el producto que quieras modificar</h1>

<%
ProductoService service = ProductoService.getInstance();
List<Producto> productos = service.getProductos();

for(Producto producto: productos){%>
<p><%=producto.getNombre() %> --- Categoría: <%=producto.getCategoria() %> --- <%=producto.getPrecio() %> € 
	--- Cantidad =  <%=producto.getStock() %>  
	<a href="Modificar?id=<%=producto.getId() %>&nombre=<%=producto.getNombre()%>&categoria=<%=producto.getCategoria()%>
	&precio=<%=producto.getPrecio()%>&stock=<%=producto.getStock()%>">Modificar</a></p>
<%} 
%>

<a href="index.html">Volver al índice</a>

</body>
</html>