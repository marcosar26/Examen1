package marcos.alonsoreyero_examen1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declaramos las variables
        Button jugar = findViewById(R.id.btnJugar);
        Button conf = findViewById(R.id.btnConfiguracion);
        Button punt = findViewById(R.id.btnPuntuacines);
        Button acercade = findViewById(R.id.btnAcercaDe);
        Button salir = findViewById(R.id.btnSalir);
        // Cambiamos el texto en tiempo real
        salir.setText("Cerrar la aplicación");

        // Para no repetir código se crea un nuevo método
        jugar.setOnClickListener(view -> opcionNoImplementada());
        conf.setOnClickListener(view -> opcionNoImplementada());
        punt.setOnClickListener(view -> opcionNoImplementada());
        acercade.setOnClickListener(view -> {
            // Creamos un Intent y se lo pasamos al startActivity para crear la actividad
            Intent intent = new Intent(MainActivity.this, AcercaDe.class);
            MainActivity.this.startActivity(intent);
        });
        salir.setOnClickListener(view -> {
            // Creamos un AlertDialog.Builder y le pasamos todos los datos
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("ADVERTENCIA");
            builder.setMessage("Se va a cerrar la aplicación");
            // Se crean los botones y se pasa el método finish para destruir la actividad
            builder.setPositiveButton("Aceptar", (dialog, which) -> MainActivity.this.finish());
            builder.setNegativeButton("Cancelar", null);
            builder.show();
        });
    }

    private void opcionNoImplementada() {
        Toast.makeText(MainActivity.this, "Esta opción todavía no está implementada.", Toast.LENGTH_LONG).show();
    }
}