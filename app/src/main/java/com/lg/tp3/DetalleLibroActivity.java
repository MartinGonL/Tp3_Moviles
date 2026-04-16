package com.lg.tp3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.lg.tp3.databinding.ActivityDetalleLibroBinding;
import com.lg.tp3.modelos.DetalleLibroVista;
import com.lg.tp3.modelos.Libro;

public class DetalleLibroActivity extends AppCompatActivity {
    private ActivityDetalleLibroBinding binding;
    private  DetalleLibroViewModel detalleLibroViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetalleLibroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        detalleLibroViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(DetalleLibroViewModel.class);

        detalleLibroViewModel.armarVista(getIntent());

        detalleLibroViewModel.getDetalleLibroVistaMutableLiveData().observe(this, new Observer<DetalleLibroVista>() {
            @Override
            public void onChanged(DetalleLibroVista detalleLibroVista) {
                binding.tvTitulo.setText(detalleLibroVista.getTitulo());
                binding.tvAutor.setText(detalleLibroVista.getAutor());
                binding.tvPaginas.setText(detalleLibroVista.getPaginas());
                binding.tvAnio.setText(detalleLibroVista.getAnio());
                binding.tvGenero.setText(detalleLibroVista.getGenero());
                binding.tvDescripcion.setText(detalleLibroVista.getDescripcion());
                binding.ivLibro.setImageResource(detalleLibroVista.getIdFoto());
            }
        });
    }
}