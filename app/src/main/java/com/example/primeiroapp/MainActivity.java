package com.example.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText rEditNota1, rEditNota2, rEditNota3, rEditNota4;
    private TextView rTextResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rEditNota1 = findViewById(R.id.editNota1);
        rEditNota2 = findViewById(R.id.editNota2);
        rEditNota3 = findViewById(R.id.editNota3);
        rEditNota4 = findViewById(R.id.editNota4);

        rTextResultado = findViewById(R.id.textResultado);
    }

    public void calcular(View view) {

        double nota1, nota2, nota3, nota4, media;

        nota1 = Double.parseDouble(rEditNota1.getText().toString());
        nota2 = Double.parseDouble(rEditNota2.getText().toString());
        nota3 = Double.parseDouble(rEditNota3.getText().toString());
        nota4 = Double.parseDouble(rEditNota4.getText().toString());

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7.0) {
            rTextResultado.setText("ALUNO APROVADO! =D");
            rTextResultado.setTextColor(Color.parseColor("#008000"));
        } else {
            rTextResultado.setText("ALUNO REPROVADO! =(");
            rTextResultado.setTextColor(Color.parseColor("#FF0000"));
        }

    }

    public void resetar(View view) {

        rEditNota1.setText("");
        rEditNota2.setText("");
        rEditNota3.setText("");
        rEditNota4.setText("");

        rTextResultado.setText("Resultado");
        rTextResultado.setTextColor(Color.parseColor("#6200ED"));
    }
}