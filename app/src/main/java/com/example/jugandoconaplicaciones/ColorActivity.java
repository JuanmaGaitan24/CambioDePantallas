package com.example.jugandoconaplicaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ColorActivity extends AppCompatActivity {
public static final String COLOR = "COLOR";
TextView saludo;
EditText txtcolor;
Button btnvolver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        saludo = findViewById(R.id.textViewColor);
        txtcolor = findViewById(R.id.editTextColor);
        btnvolver = findViewById(R.id.buttonVolverCol);

        Intent intento = getIntent();

        String nombre = intento.getStringExtra(MainActivity.NOMBRE);

        saludo.setText(nombre);

        btnvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String color = txtcolor.getText().toString();

                Intent intent = new Intent();
                intent.putExtra(COLOR, color);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }
}