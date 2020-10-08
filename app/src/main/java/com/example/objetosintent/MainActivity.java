package com.example.objetosintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {

    EditText nome, sobrenome;
    Button btProxima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.editTextNome);
        sobrenome = findViewById(R.id.editTextSobrenome);
        btProxima = findViewById(R.id.buttonProxima);

        btProxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Resultado.class);

                Pessoa p = new Pessoa(nome.getText().toString(),sobrenome.getText().toString());

                it.putExtra("pessoa",p);

                startActivity(it);
            }
        });

    }
}