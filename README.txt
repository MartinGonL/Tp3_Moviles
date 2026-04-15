¿De qué trata el proyecto?
La aplicación consta de dos pantallas (Activities):Buscador: Donde el usuario ingresa el nombre del libro (por ejemplo: "El Hobbit") y pulsa el botón "Buscar".Vista Detalle: Si el libro existe, se abre esta pantalla mostrando toda su información: Autor, Año, Género, Páginas y una breve descripción.

Tecnologías y HerramientasPara este proyecto utilicé:Lenguaje: Java 

Entorno: Android Studio.Arquitectura: MVVM (Model-View-ViewModel) para separar la lógica de la interfaz.View Binding: Para conectar el código con el diseño XML de forma segura.LiveData y Observers: Para que la pantalla reaccione automáticamente cuando se encuentra un libro.

Estructura del CódigoSiguiendo las pautas de la cátedra, el proyecto está organizado así:Modelo (Libro.java): Clase que contiene los datos del libro.ViewModel (MainViewModel.java): Extiende de AndroidViewModel y maneja la lógica de búsqueda de forma independiente a la vista.Vistas (MainActivity y DetailActivity): Se encargan únicamente de mostrar la información y capturar los clics del usuario.

Instrucciones
Clonar el repositorio.

Abrir el proyecto en Android Studio.

Ejecutar en un emulador o dispositivo físico.

Escribir "El Hobbit" en el buscador para probar el funcionamiento.
Cargas Adicionales para prueba propia:" Harry Potter, 1984, El Principito, Cien años de soledad, Rayuela, Fahrenheit 451,El Aleph, Don Quijote."


Integrantes:
Sosa Gaston Oscar 37090426
Lucero Gontero Martin 38419062
Subidia Santiago 45801536