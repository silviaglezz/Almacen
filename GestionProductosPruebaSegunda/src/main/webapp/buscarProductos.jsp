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
<title>Productos encontrados</title>
</head>
<body>
<%
ProductoService service = ProductoService.getInstance();

String categoria = request.getParameter("categoria");
List<Producto> productos = new ArrayList<>();
List<Producto> productosValidados = service.validarCategoria(categoria);


if(categoria != null && !categoria.isEmpty()){%>
	<h1>Productos encontrados con la categoría: <%=categoria %></h1>
		
	<%
	for(Producto producto: productosValidados){
		productos.add(producto);
	}
		
	for(Producto p: productos){%>
		<p><%=p.getNombre() %> --- <%=p.getPrecio() %> € 
		--- Cantidad =  <%=p.getStock() %></p>
	<%}
}else{%>
	<p>No se han encontrado productos para esa categoría.</p>
<%}
%>

<a href="index.html">Volver al índice</a>
</body>
</html>