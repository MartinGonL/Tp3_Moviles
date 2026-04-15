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
    private List<Libro> listaDeLibros = new ArrayList<>();

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        cargarLibros();
    }

    private void cargarLibros() {
        listaDeLibros.add(new Libro("El Hobbit", "J.R.R Tolkien", 300, 1937, "Fantasia Adventura", "Novela de fantasía para niños..."));
        listaDeLibros.add(new Libro("Harry Potter", "J.K. Rowling", 309, 1997, "Fantasía", "Un niño descubre que es mago..."));
        listaDeLibros.add(new Libro("1984", "George Orwell", 328, 1949, "Distopía", "Futuro vigilado por el Gran Hermano."));
        listaDeLibros.add(new Libro("El Principito", "A. Saint-Exupéry", 96, 1943, "Fábula", "Lecciones de vida en un viaje espacial."));
        listaDeLibros.add(new Libro("Cien años de soledad", "G. García Márquez", 471, 1967, "Realismo mágico", "La familia Buendía en Macondo."));
        listaDeLibros.add(new Libro("Rayuela", "Julio Cortázar", 600, 1963, "Novela", "Historia argentina con múltiples lecturas."));
        listaDeLibros.add(new Libro("Fahrenheit 451", "Ray Bradbury", 158, 1953, "Distopía", "Bomberos que queman libros."));
        listaDeLibros.add(new Libro("El Aleph", "Jorge Luis Borges", 146, 1949, "Ficción", "Cuentos sobre lo infinito."));
        listaDeLibros.add(new Libro("Don Quijote", "M. de Cervantes", 863, 1605, "Clásico", "Aventuras de un caballero loco."));
    }

    public LiveData<Libro> getMLibro() {
        return mLibro;
    }

    public void buscar(String nombre) {
        Libro encontrado = null;
        for (Libro l : listaDeLibros) {
            if (l.getTitulo().equalsIgnoreCase(nombre)) {
                encontrado = l;
                break;
            }
        }
        mLibro.setValue(encontrado);
    }
}