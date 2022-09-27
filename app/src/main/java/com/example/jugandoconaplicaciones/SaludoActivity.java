package com.example.jugandoconaplicaciones;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {
    public static final String NUMERO = "NUMERO";
    TextView saludo;
EditText txtnum;
Button btnvolver;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        saludo = findViewById(R.id.textViewSaludo);
        txtnum = findViewById(R.id.editTextNumero);
        btnvolver = findViewById(R.id.buttonVolver);

        Intent inten = getIntent();

        String nombre = inten.getStringExtra(MainActivity.NOMBRE);

        saludo.setText("Hola " + nombre);

        btnvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = txtnum.getText().toString();

                Intent intento = new Intent();
                intento.putExtra(NUMERO, num);
                setResult(RESULT_OK, intento);
                finish();
            }
        });
    }
}