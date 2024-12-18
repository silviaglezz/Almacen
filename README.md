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
La clase ProductoService representa un servicio del producto de un almacén. En esta clase se crea la lista de los diferentes productos.

### 2.2. Funcionalidades
La clase ProductoService tiene las siguientes funcionalidades:
- getInstance(): Se encarga de crear una instancia del servicio si es nula o devolver la instancia ya existente.
- getProductos(): Devuelve una lista con los diferentes productos.
- setProductos(List<Producto> producto): Se encarga de actualizar la lista de productos con la lista que se le pasa como parámetros.
- obtenerCategorias(): Devuelve aquellos productos cuya categoría no se repita.
- añadirProducto(String nombre, String categoria, double precio, int stock): Se encarga de añadir el producto con los parámetros pasados a la lista.
- eliminarProducto(Producto producto): Elimina el producto pasado como parámetro de la lista de productos.
- modificarProducto(Producto producto): Actualiza los valores del producto con el producto pasado como parámetro.
- validarCategorias(String categoria): Crea una lista de productos que coinciden con la categoría pasada por parámetro.
- obtenerProductoPorId(int id): devuelve un producto si su id coincide con el pasado como parámetro.

### 2.3. Uso
Para utilizar la clase ProductoService, se tiene que crear una instancia del servicio.

### 2.4. Historia
•	Version 0.1 (2024-12-17) - lanzamiento inicial

## 3. Servlet Controlador
Este es un proyecto Java que define el servlet Controlador.

### 3.1. Descripción
El servlet Controlador representa un servlet que gestiona las opciones para realizar con los productos.

### 3.2. Funcionalidades
El servlet Controlador tiene la siguiente funcionalidad:
- doGet(HttpServletRequest request, HttpServletResponse response): Recoge la opción que seleccionó el usuario para saber que realizar con los productos.

### 3.3. Uso
Para utilizar el servlet Controlador se tiene llamar desde un link pasando la opción.

### 3.4. Historia
•	Version 0.1 (2024-12-17) - lanzamiento inicial
## 4. Servlet DarDeAlta
Este es un proyecto Java que define el servlet DarDeAlta.

### 4.1. Descripción
El servlet DarDeAlta representa un servlet que se encarga de añadir un producto a la lista, obteniendo los datos necesarios de un formulario.

### 4.2. Funcionalidades
El servlet DarDeAlta tiene la siguiente funcionalidad:
- doPost(HttpServletRequest request, HttpServletResponse response): Recoge los datos necesarios para que a través del servicio añada el producto a la lista.

### 4.3. Uso
Para utilizar el servlet DarDeAlta puede ser llamado desde un _action_.

### 4.4. Historia
•	Version 0.1 (2024-12-17) - lanzamiento inicial

## 5. Servlet Eliminar
Este es un proyecto Java que define el servlet Eliminar.

### 5.1. Descripción
El servlet Eliminar representa un servlet que se encarga de eliminar un producto a la lista, obteniendo los datos necesarios.

### 5.2. Funcionalidades
El servlet Eliminar tiene la siguiente funcionalidad:
- doGet(HttpServletRequest request, HttpServletResponse response): Recoge los datos necesarios para que a través del servicio elimine el producto a la lista.

### 5.3. Uso
Para utilizar el servlet Eliminar se tiene que llamar desde un enlace, pasándole los datos necesarios para eliminar el producto.

### 5.4. Historia
•	Version 0.1 (2024-12-17) - lanzamiento inicial

## 6. Servlet Modificar
Este es un proyecto Java que define el servlet Modificar.

### 6.1. Descripción
El servlet Modificar representa un servlet que se encarga de modificar un producto a la lista, obteniendo los datos necesarios.

### 6.2. Funcionalidades
El servlet Modificar tiene las siguientes funcionalidades:
- doGet(HttpServletRequest request, HttpServletResponse response): Recoge los datos necesarios para que el servlet llame a un jsp para modificar un producto en concreto.
- doPost(HttpServletRequest request, HttpServletResponse response): Recoge los datos necesarios a través de un formulario para que el servicio se encargue de modificar el producto de la lista.

### 6.3. Uso
Para utilizar el servlet Modificar, tiene que ser llamado desde un enlace para acceder al doGet() y después puede ser llamado desde un _action_ para que realice el doPost() y actualice correctamente el producto seleccionado.

### 6.4. Historia
•	Version 0.1 (2024-12-17) - lanzamiento inicial

## 7. index.html
Este es un proyecto Java que define el fichero index.html.

### 7.1. Descripción
El fichero index.html representa un índice con las diferentes acciones que puede realizar el usuario para gestionar los productos del almacén.

### 7.2. Uso
Para utilizar el fichero index.html se tiene que ejecutar de primero.

### 7.3. Historia
•	Version 0.1 (2024-12-17) - lanzamiento inicial

## 8. alta.html
Este es un proyecto Java que define el fichero alta.html.

### 8.1. Descripción
El fichero alta.html representa un formulario con los diferentes campos para añadir un nuevo producto a la lista.

### 8.2. Uso
Para utilizar el fichero alta.html se tiene que pulsar la opción de dar de alta del fichero index.html.

### 8.3. Historia
•	Version 0.1 (2024-12-17) - lanzamiento inicial

## 9. eliminar.jsp
Este es un proyecto Java que define el fichero eliminar.jsp.

### 9.1. Descripción
El fichero eliminar.jsp representa una lista con los diferentes productos y cada uno de ellos tiene un enlace para eliminar el producto.

### 9.2. Uso
Para utilizar el fichero eliminar.jsp se tiene que pulsar la opción de eliminar del fichero index.html.

### 9.3. Historia
•	Version 0.1 (2024-12-17) - lanzamiento inicial

## 10. modificar.jsp
Este es un proyecto Java que define el fichero modificar.jsp.

### 10.1. Descripción
El fichero modificar.jsp representa una lista con los diferentes productos y cada uno de ellos tiene un enlace para modificar el producto.

### 10.2. Uso
Para utilizar el fichero modificar.jsp se tiene que pulsar la opción de modificar del fichero index.html.

### 10.3. Historia
•	Version 0.1 (2024-12-17) - lanzamiento inicial

## 11. modificarProducto.jsp
Este es un proyecto Java que define el fichero modificarProducto.jsp.

### 11.1. Descripción
El fichero modificarProducto.jsp representa un formulario con el producto seleccionado a modificar de la lista de productos modificables.

### 11.2. Uso
Para utilizar el fichero modificarProducto.jsp se tiene que pulsar en el enlace de modificar del fichero modificar.jsp.

### 11.3. Historia
•	Version 0.1 (2024-12-17) - lanzamiento inicial

## 12. buscar.jsp
Este es un proyecto Java que define el fichero buscar.jsp.

### 12.1. Descripción
El fichero buscar.jsp representa un formulario con un desplegable de las diferentes categorías de los productos para realizar una búsqueda de los diferentes productos filtrando por la categoría seleccionada.

### 12.2. Uso
Para utilizar el fichero buscar.jsp se tiene que pulsar en el enlace de buscar del fichero index.html.

### 12.3. Historia
•	Version 0.1 (2024-12-17) - lanzamiento inicial

## 13. buscarProducto.jsp
Este es un proyecto Java que define el fichero buscarProducto.jsp.

### 13.1. Descripción
El fichero buscarProducto.jsp representa una lista de los diferentes productos encontrados con la categoría seleccionada en el formulario del fichero buscar.jsp.

### 13.2. Uso
Para utilizar el fichero buscarProducto.jsp se tiene que pulsar en el botón de buscar del fichero buscar.jsp.

### 13.3. Historia
•	Version 0.1 (2024-12-17) - lanzamiento inicial

## 14. listar.jsp
Este es un proyecto Java que define el fichero listar.jsp.

### 14.1. Descripción
El fichero listar.jsp representa una lista de los diferentes productos existentes.

### 14.2. Uso
Para utilizar el fichero listar.jsp se tiene que pulsar en el botón de mostrar listado del fichero index.html.

### 14.3. Historia
•	Version 0.1 (2024-12-17) - lanzamiento inicial

