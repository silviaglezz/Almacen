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

## 3. Clase Conducible 
Este es un proyecto Java que define la interfaz Conducible.

### 3.1. Descripción
La interfaz Conducible define las acciones básicas de un vehículo. En la interfaz Conducible se definen los métodos conducir(), avanzar(int metros), retroceder(int metros) y parar(). Estos métodos se implementarán en aquellas clases que implementen esta interfaz. 

### 3.2. Funcionalidades
La clase Coche tiene las siguientes funcionalidades:
Constructor: Crea una instancia de Coche con un color y una matrícula.
- conducir(): Arranca el coche y establece la hora de inicio del viaje. Si el coche ya está en marcha, muestra un mensaje de aviso.
- avanzar(int metros): Avanza el coche la cantidad de metros indicada. Si el coche no está en marcha, muestra un mensaje de aviso. 
- retroceder(int metros): Retrocede el coche la cantidad de metros indicada. Si el coche no está en marcha, muestra un mensaje de aviso.
- parar(): Para el coche y muestra el tiempo total del viaje. Si el coche no está en marcha, muestra un mensaje de aviso.
- calcularVelocidad(): Calcula la velocidad media al obtener el tiempo total del viaje y el espacio recorrido. Si el tiempo total del viaje es menor que 0 se muestra un mensaje de error.

### 2.3. Uso
Para utilizar la interfaz Conducible, se tiene que crear una clase que implemente dicha interfaz para poder implementar los diferentes métodos definidos en Conducible.

### 2.4. Historia
•	Version 0.1 (2024-12-10) - lanzamiento inicial

## 3. Clase Coche
Este es un proyecto Java que define la clase Coche, que extiende de la clase Vehiculo y que implementa la interfaz Conducible.

### 3.1. Descripción
La clase Coche representa un vehículo y se utiliza para instanciar objetos que contienen información sobre el color y la matrícula del coche. Además de los métodos que provienen de la interfaz Conducible, esta clase también tiene un método para calcular la velocidad media del coche durante su trayecto.

### 3.2. Funcionalidades
La clase Coche tiene las siguientes funcionalidades:
Constructor: Crea una instancia de Coche con un color y una matrícula.
- conducir(): Arranca el coche y establece la hora de inicio del viaje. Si el coche ya está en marcha, muestra un mensaje de aviso.
- avanzar(int metros): Avanza el coche la cantidad de metros indicada. Si el coche no está en marcha, muestra un mensaje de aviso. 
- retroceder(int metros): Retrocede el coche la cantidad de metros indicada. Si el coche no está en marcha, muestra un mensaje de aviso.
- parar(): Para el coche y muestra el tiempo total del viaje. Si el coche no está en marcha, muestra un mensaje de aviso.
- calcularVelocidad(): Calcula la velocidad media al obtener el tiempo total del viaje y el espacio recorrido. Si el tiempo total del viaje es menor que 0 se muestra un mensaje de error.

### 3.3. Uso
Para utilizar la clase Coche, primero se debe instanciar un objeto pasando los argumentos adecuados al constructor. Luego, se puede llamar a los métodos descritos en las funcionalidades según sea necesario.

### 3.4. Historia
•	Version 0.1 (2024-12-10) - lanzamiento inicial

