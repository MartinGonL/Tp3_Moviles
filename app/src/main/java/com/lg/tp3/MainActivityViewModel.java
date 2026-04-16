package com.lg.tp3;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.lg.tp3.modelos.Libro;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    private MutableLiveData<Libro> mLibro = new MutableLiveData<>();
    private MutableLiveData<String> mTexto = new MutableLiveData<>();
    private List<Libro> listaDeLibros = new ArrayList<>();

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        cargarLibros();
    }

    public LiveData<Libro> getMLibro() {
        return mLibro;
    }
    public LiveData<String> getMTexto() {
        return mTexto;
    }

    public void buscar(String nombre) {
        for (Libro l : listaDeLibros) {
            if (l.getTitulo().equalsIgnoreCase(nombre)) {
                mLibro.setValue(l);
                return;
            }
        }
        mTexto.setValue("Libro no encontrado");
    }

    private void cargarLibros() {
        listaDeLibros.add(new Libro(
                "El Hobbit",
                "J.R.R Tolkien",
                300,
                1937,
                new String[]{"Fantasía Épica", "Aventura", "Literatura Juvenil"},
                "Bilbo Bolsón es arrastrado a una épica misión para recuperar el tesoro de los enanos custodiado por el temible dragón Smaug. A lo largo del viaje, descubrirá su propia valentía y encontrará un misterioso anillo que cambiará el destino de la Tierra Media.",
                R.drawable.el_hobbit
                ));

        listaDeLibros.add(new Libro(
                "Harry Potter y la piedra filosofal",
                "J.K. Rowling",
                309,
                1997,
                new String[]{"Fantasía", "Magia", "Misterio"},
                "Un niño huérfano descubre en su undécimo cumpleaños que es un mago. Al ingresar a la Escuela Hogwarts de Magia y Hechicería, no solo aprende a controlar sus poderes, sino que también descubre un oscuro legado y a un terrible enemigo que busca regresar.",
                R.drawable.harry_potter
        ));

        listaDeLibros.add(new Libro(
                "1984",
                "George Orwell",
                328,
                1949,
                new String[]{"Ciencia Ficción", "Distopía", "Ficción Política"},
                "En un Londres lúgubre y totalitario gobernado por el omnipresente Gran Hermano, Winston Smith trabaja reescribiendo la historia. Su anhelo de libertad lo lleva a una rebelión secreta y a un amor prohibido, enfrentándose a un sistema que no tolera la disidencia.",
                R.drawable.libro_1984
                ));

        listaDeLibros.add(new Libro(
                "Cien años de soledad",
                "G. García Márquez",
                471,
                1967,
                new String[]{"Realismo Mágico", "Saga Familiar", "Ficción Histórica"},
                "Narra la historia de siete generaciones de la familia Buendía en el pueblo ficticio de Macondo. La obra entreteje lo mítico y lo cotidiano, explorando temas como el amor, la guerra, la memoria y la inevitable repetición de los errores a través del tiempo.",
                R.drawable.cien_anios
                ));

        listaDeLibros.add(new Libro(
                "Rayuela",
                "Julio Cortázar",
                600,
                1963,
                new String[]{"Ficción Vanguardista", "Realismo Psicológico", "Novela Filosófica"},
                "Sigue los pasos de Horacio Oliveira, un intelectual argentino en París y Buenos Aires. La novela rompe las estructuras narrativas tradicionales, permitiendo al lector elegir múltiples órdenes de lectura para explorar la búsqueda del sentido existencial y el absurdo.",
                R.drawable.rayuela
                ));

        listaDeLibros.add(new Libro(
                "Fahrenheit 451",
                "Ray Bradbury",
                158,
                1953,
                new String[]{"Ciencia Ficción", "Distopía", "Crítica Social"},
                "En una sociedad futura donde los libros están prohibidos por promover el pensamiento crítico, Guy Montag trabaja como bombero con la misión de quemarlos. Tras conocer a una joven diferente, comienza a cuestionar su trabajo y el vacío de su entorno.",
                R.drawable.fahrenheit
                ));

        listaDeLibros.add(new Libro(
                "El Aleph",
                "Jorge Luis Borges",
                146,
                1949,
                new String[]{"Realismo Mágico", "Cuento Corto", "Ficción Filosófica"},
                "Una colección de cuentos que explora los laberintos, los espejos, el infinito y la naturaleza de la realidad. El relato principal presenta un punto en el espacio que contiene todos los demás puntos del universo simultáneamente, desafiando la comprensión del tiempo.",
                R.drawable.el_aleph
                ));

        listaDeLibros.add(new Libro(
                "Don Quijote de la Mancha",
                "M. de Cervantes",
                863,
                1605,
                new String[]{"Sátira", "Novela Picaresca", "Clásico Universal"},
                "Alonso Quijano, un hidalgo empobrecido, enloquece tras leer demasiados libros de caballería y decide convertirse en caballero andante. Acompañado por su pragmático escudero Sancho Panza, protagoniza aventuras tragicómicas que reflexionan sobre el idealismo.",
                R.drawable.don_quijote
                ));
    }
}