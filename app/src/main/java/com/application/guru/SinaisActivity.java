package com.application.guru;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Random;

public class SinaisActivity extends AppCompatActivity {


    private String[] respostas = {"Sim", "Não", "Talvez", "Pergunte novamente", "Dificil dizer", "Concentre-se e pergunte novamente", "Não conte com isso", "Minhas fontes dizem não", "Sim, definitivamente", "Não posso prever agora", "Não apostaria nisso", "Provavelmente", "Não posso dizer agora", "Sim, com toda certeza", "Não", "Parece bom", "As perspectivas são boas", "Muito duvidoso", "Sim, em seu devido tempo", "Não se preocupe com isso"};

    private TextView respostaText;
    private ImageView mandalaImage;
    private Button novaConsultaButton;
    private ImageView voltarButton;
    private boolean mandalaClicada = false;
    private boolean novaConsultaClicada = false;
    private LottieAnimationView animationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinais);

        respostaText = findViewById(R.id.respostaText);
        animationView = findViewById(R.id.animationView);
        novaConsultaButton = findViewById(R.id.novaConsultaButton);
        voltarButton = findViewById(R.id.voltarButton);
        novaConsultaButton.setVisibility(View.INVISIBLE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                exibirMensagem();
            }
        }, 1000);


        animationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mandalaClicada && !novaConsultaClicada) {
                    mandalaClicada = true;
                    reproduzirAnimacao();
                } else if (novaConsultaClicada) {
                    novaConsultaClicada = false; // Redefina para false para evitar exibir a resposta novamente
                    reproduzirAnimacao();
                }
            }
        });

        novaConsultaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respostaText.setText("");
                novaConsultaButton.setVisibility(View.INVISIBLE);
                voltarButton.setVisibility(View.INVISIBLE);

                novaConsultaClicada = true;


            }
        });




        voltarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    private void reproduzirAnimacao() {
        // Reproduzir a animação por 2 segundos
        animationView.playAnimation();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                animationView.cancelAnimation();

                String resposta = obterRespostaAleatoria();
                respostaText.setText(resposta);
                voltarButton.setVisibility(View.VISIBLE);
                novaConsultaButton.setVisibility(View.VISIBLE);

            }
        }, 4000);
    }

    private void exibirMensagem() {
        Toast.makeText(this, "Toque na mandala para saber sua resposta", Toast.LENGTH_LONG).show();
    }

    private String obterRespostaAleatoria() {
        Random random = new Random();
        int index = random.nextInt(respostas.length);
        return respostas[index];
    }
}

