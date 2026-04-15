package com.lg.tp3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.lg.tp3.databinding.ActivityMainBinding;
import com.lg.tp3.modelos.Libro;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainActivityViewModel vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Inicialización del ViewModel
        vm = new ViewModelProvider(this).get(MainActivityViewModel.class);

        // Observamos el cambio en el MutableLiveData
        vm.getMLibro().observe(this, new Observer<Libro>() {
            @Override
            public void onChanged(Libro libro) {
                if (libro != null) {
                    Intent intent = new Intent(MainActivity.this, DetalleLibroActivity.class);
                    intent.putExtra("libro", libro); //
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Libro no encontrado", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.btnBuscar.setOnClickListener(v -> { // [cite: 15]
            String texto = binding.etBuscador.getText().toString();
            vm.buscar(texto);
        });
    }
}