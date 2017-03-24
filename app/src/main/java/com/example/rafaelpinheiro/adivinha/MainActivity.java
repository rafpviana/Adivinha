package com.example.rafaelpinheiro.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;
    private TextView textoresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (Button) findViewById(R.id.botaoJogarId);

        textoresultado = (TextView) findViewById(R.id.resultadoId);

//        textoresultado.setText("Texto alterado");



        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textoresultado.setText("Botao clicado");

                Random geradorRandomico = new Random();

                int numero = geradorRandomico.nextInt(11);

                textoresultado.setText("Numero excolhido: "+numero);

            }
        });
    }
}
