package com.example.jugandoconaplicaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String NOMBRE = "NOMBRE";
    Button btnlanzar;
    EditText txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlanzar = findViewById(R.id.buttonLanzar);
        txtNombre = findViewById(R.id.editTextNombre);

        btnlanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(MainActivity.this, SaludoActivity.class);
                intento.putExtra(NOMBRE, txtNombre.getText().toString());
                startActivity(intento);
            }
        });

    }
}