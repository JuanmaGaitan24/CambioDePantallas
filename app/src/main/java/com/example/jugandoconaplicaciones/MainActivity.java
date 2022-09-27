package com.example.jugandoconaplicaciones;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String NOMBRE = "NOMBRE";
    public static final int COD_IDEN = 24;
    Button btnlanzar;
    EditText txtNombre;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == COD_IDEN && resultCode == RESULT_OK){
            String numero = data.getStringExtra(SaludoActivity.NUMERO);
            txtNombre.setText(txtNombre.getText() + " " + numero);
        }
    }

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
                startActivityForResult(intento, COD_IDEN);


                //startActivity(intento);

            }
        });

    }
}