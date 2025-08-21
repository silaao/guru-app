package com.application.guru;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referências para os ícones
        Button sinaisButton = findViewById(R.id.sinaisButton);
        Button ventosButton = findViewById(R.id.ventosButton);
        Button sabedoriaButton = findViewById(R.id.sabedoriaButton);

        // Configurar clique nos ícones
        sinaisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SinaisActivity.class));
            }

        });

        ventosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, VentosActivity.class));
            }
        });

        sabedoriaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SabedoriaActivity.class));
            }
        }
        );
    }
}
