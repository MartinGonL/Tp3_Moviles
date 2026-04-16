package com.lg.tp3;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.lg.tp3.modelos.DetalleLibroVista;
import com.lg.tp3.modelos.Libro;

public class DetalleLibroViewModel extends AndroidViewModel {

    private MutableLiveData<DetalleLibroVista> detalleLibroVistaMutableLiveData = new MutableLiveData<>();

    public DetalleLibroViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<DetalleLibroVista> getDetalleLibroVistaMutableLiveData(){
        return detalleLibroVistaMutableLiveData;
    }

    public void armarVista(Intent intent){
        Libro libro = (Libro) intent.getSerializableExtra("libro");

        String titulo = libro.getTitulo();
        String autor = libro.getAutor();
        String paginas = "Paginas: " + libro.getPaginas();
        String anios = "Años: " + libro.getAnio();
        String generos = "Generos: " + String.join(",",libro.getGenero());
        String descripcion = libro.getDescripcion();
        int idFoto = libro.getIdFoto();

        DetalleLibroVista detalleLibroVista = new DetalleLibroVista(titulo,autor,descripcion,paginas,anios,generos,idFoto);
        detalleLibroVistaMutableLiveData.setValue(detalleLibroVista);
    }
}
