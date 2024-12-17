# PruebaSegunda
Este proyecto en Java implementa un sistema de gestión de productos de un almacén.

## 1. Clase Producto
Este es un proyecto Java que define la clase Producto.

### 1.1. Descripción
La clase Producto representa un producto de un almacén. Tiene como parámetros el id, un identificador único; el nombre, que representa el nombre del producto; la categoría, que representa la categoría de un producto; el precio y el stock, que representa la cantidad que hay de ese producto.

### 1.2. Uso
Para utilizar la clase Producto, se tiene que crear instancia de un producto.

### 1.3. Historia
•	Version 0.1 (2024-12-17) - lanzamiento inicial

## 2. Clase ProductoService
Este es un proyecto Java que define la clase ProductoService.

### 2.1. Descripción
La clase ProductoService representa un servicio de producto de un almacén. En esta clase se crea la lista de los diferentes productos.

### 2.2. Funcionalidades
La clase ProductoService tiene las siguientes funcionalidades:
- getInstance(): Se encarga de crear una instancia del servicio si es nula o devolver la instancia ya existente.
- getProductos(): Devuelve los productos de la lista.
- setProductos(List<Producto> producto): actualiza la lista de productos.
- obtenerCategorias(): devuelve los productos que no tienen la categoría repetida.
- añadirProducto(String nombre, String categoria, double precio, int stock): añade el producto a la lista con los parámetros pasados.
- eliminarProducto(Producto producto): Elimina el producto de la lista de productos.
- modificarProducto(Producto producto): Actualiza los valores del producto.
- validarCategorias(String categoria): Crea una lista de productos que coinciden con la categoría pasada por parámetro.
- obtenerProductoPorId(int id): devuelve un producto si su id coincide con el pasado como parámetro.

### 2.3. Uso
Para utilizar la clase ProductoService, se tiene que crear instancia de servicio.

### 2.4. Historia
•	Version 0.1 (2024-12-17) - lanzamiento inicial

## 3. Servlet Controlador
Este es un proyecto Java que define el servlet Controlador.

### 3.1. Descripción
La servlet Controlador representa un servlet que gestiona las opciones para gestionar los productos.

### 3.2. Funcionalidades
El servlet Controlador tiene la siguiente funcionalidad:
- doGet(): Recoge la opción que seleccionó el usuario para saber que realizar para geestionar los productos.

### 3.3. Uso
Para utilizar el servlet Controlador, se tiene llamar desde un link.

### 3.4. Historia
•	Version 0.1 (2024-12-17) - lanzamiento inicial
