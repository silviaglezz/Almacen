package com.curso.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.curso.modelo.Producto;

/**
 * Clase ProductoService que representa un service de productos en el cual se
 * guardan los productos añadidos y se hacen diferentes operaciones con ellos
 * Está representado por una lista de prodcutos
 * 
 * @author Silvia Gonzalez / ViewNext
 * @version 1.0, 17/12/2024
 *
 */
public class ProductoService {
	private static List<Producto> productos = new ArrayList<Producto>();
	private int id=4;
	private static ProductoService instance;
	
	//Asignacion estatica
		static {
			Producto p1 = new Producto(0,"Producto 1", "Madera", 10, 5);
			Producto p2 = new Producto(1,"Producto 2", "Metal", 15.5, 3);
			Producto p3 = new Producto(2,"Producto 3", "Hierro", 20.45, 2);
			
			productos.add(p1);
			productos.add(p2);
			productos.add(p3);
		}
		
	/**	
	 * Método para inicializar el servicio cuando sea null
	 * 
	 * @return instance la instancia del servicio
	 */
	public static synchronized ProductoService getInstance() {
		if(instance == null) {
			instance = new ProductoService();
		}
		return instance;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		ProductoService.productos = productos;
	}


	/**
	 * Método para obtener todos los productos sin repetir la categoría
	 * 
	 * @return productos, lista de productos
	 */
	public List<Producto> obtenerCategorias() {
		productos = productos.stream().distinct().collect(Collectors.toList());
		return productos;
	}
	
	/**
	 * Método para añadir un producto a la lista de productos creada
	 * 
	 * @param producto producto que se pasa como parámetro y se quiere añadir a la lista
	 */
	public void añadirProducto(String nombre, String categoria, double precio, int stock){
		productos.add(new Producto(id, nombre, categoria, precio, stock));
		id++;
		
		this.setProductos(productos);
	}
	
	/**
	 * Método para eliminar un producto de la lista de productos
	 * 
	 * @param producto producto que se para como parámetro y se quiere eliminar de la lista
	 */
	public void eliminarProducto(Producto producto) {
		productos.remove(producto);
		
		this.setProductos(productos);
	}
	
	/**
	 * Método para reemplazar un producto de la lista de productos y así realizar su modificación
	 * 
	 * @param producto producto que se actualiza
	 */
	public void modificarProducto(Producto producto) {
		for(int i = 0; i < productos.size(); i++) {
			Producto p = productos.get(i);
			if(p.getId() == producto.getId()) {
				productos.set(i, producto);
				return;
			}
		}
	}

	/**
	 * Método para comparar todos los productos guardados con la categoría que se
	 * pasa como parámetro
	 * 
	 * @param categoria categoria a comparar
	 * @return lista de productos comparados con la categoría
	 */
	public List<Producto> validarCategoria(String categoria) {
		List<Producto> productosValidados = new ArrayList<>();
		for (Producto producto : productos) {
			if (producto.getCategoria().equals(categoria)) {
				productosValidados.add(producto);
			}
		}
		return productosValidados;
	}

	/**
	 * Método para buscar un producto que coincida con el id que se pasa como parámetro
	 * 
	 * @param id id del producto
	 * @return el producto si coincide con algun id si no null
	 */
	public Producto obtenerProductoPorId(int id) {
		for(Producto producto: productos) {
			if(producto.getId() == id) {
				return producto;
			}
		}
		return null;
	}
}
