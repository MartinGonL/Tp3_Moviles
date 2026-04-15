package com.lg.tp3.modelos;

import java.io.Serializable;

public class Libro implements Serializable {
    private String titulo, autor, genero, descripcion;
    private int paginas, anio;

    public Libro(String titulo, String autor, int paginas, int anio, String genero, String descripcion) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.anio = anio;
        this.genero = genero;
        this.descripcion = descripcion;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getPaginas() { return paginas; }
    public int getAnio() { return anio; }
    public String getGenero() { return genero; }
    public String getDescripcion() { return descripcion; }
}
