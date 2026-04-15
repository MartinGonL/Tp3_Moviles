package com.lg.tp3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.lg.tp3.databinding.ActivityDetalleLibroBinding;
import com.lg.tp3.modelos.Libro;

public class DetalleLibroActivity extends AppCompatActivity {
    private ActivityDetalleLibroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetalleLibroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Libro libro = (Libro) getIntent().getSerializableExtra("libro");

        if (libro != null) {
            binding.tvTitulo.setText(libro.getTitulo());
            binding.tvAutor.setText(libro.getAutor());
            binding.tvPaginas.setText("Páginas: " + libro.getPaginas());
            binding.tvAnio.setText("Año: " + libro.getAnio());
            binding.tvGenero.setText(libro.getGenero());
            binding.tvDescripcion.setText(libro.getDescripcion());
        }
    }
}