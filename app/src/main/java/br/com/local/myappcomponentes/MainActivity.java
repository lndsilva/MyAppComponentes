package br.com.local.myappcomponentes;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatePicker calendario;
    Button btnHora;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendario = findViewById(R.id.idCalendario);
        btnHora = findViewById(R.id.btnHora);

        btnHora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Timer_Activity.class));
            }
        });

        int mes = calendario.getMonth();
        int ano = calendario.getYear();
        int dia = calendario.getDayOfMonth();

        Toast.makeText(getApplicationContext(),
                "Dia: " + dia + "Mês: " + mes + "Ano: " + ano,
                Toast.LENGTH_SHORT).show();


    }
}