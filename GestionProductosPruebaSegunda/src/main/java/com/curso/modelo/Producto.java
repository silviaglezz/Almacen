package com.curso.modelo;

import java.util.Objects;

/**
 * Clase Producto que representa los diferentes productos de un almacén
 * Está determinada por el nombre, la categoría, el precio y la cantidad de stock que tiene
 * 
 * @author Silvia Gonzalez / ViewNext
 * @version 1.0, 17/12/2024
 *
 */
public class Producto {
	private int id;
	private String nombre;
	private String categoria;
	private double precio;
	private int stock;
	
	public Producto() {
		super();
	}

	public Producto(int id, String nombre, String categoria, double precio, int stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoria);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(categoria, other.categoria);
	}
}
