package com.example.objetosintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    TextView nome, sobrenome, full;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        nome = findViewById(R.id.textViewNome);
        sobrenome = findViewById(R.id.textViewSobrenome);
        full = findViewById(R.id.textViewFull);

        Intent it = getIntent();

        Pessoa p = (Pessoa) it.getSerializableExtra("pessoa");

        nome.setText(p.getNome());
        sobrenome.setText(p.getSobrenome());
        full.setText(p.toString());
    }
}