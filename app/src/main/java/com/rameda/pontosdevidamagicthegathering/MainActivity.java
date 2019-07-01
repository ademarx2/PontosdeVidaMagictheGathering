package com.rameda.pontosdevidamagicthegathering;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_jogador1,tv_jogador2;
    public int valor1 = 20;
    public int valor2 = 20;

    Button btt_somaJogador1,btt_somaJogador2,btt_subtracaoJogador1,btt_subtracaoJogador2,btt_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        invocacao();

        btt_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = 20;
                valor2 = 20;
                tv_jogador1.setText(""+valor1);
                tv_jogador2.setText(""+valor2);
            }
        });

        btt_subtracaoJogador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    valor1 = valor1-1;

                        tv_jogador1.setText("" + valor1);

                }catch (Exception e){
                }
            }
        });
        btt_subtracaoJogador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    valor2 = valor2-1;
                    tv_jogador2.setText(""+valor2);
                }catch (Exception e){
                }
            }
        });
        btt_somaJogador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    valor1 = valor1+1;
                    tv_jogador1.setText(""+valor1);
                }catch (Exception e){
                }
            }
        });
        btt_somaJogador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    valor2 = valor2+1;
                    tv_jogador2.setText(""+valor2);
                }catch (Exception e){
                }
            }
        });
    }
    void invocacao(){
        tv_jogador1 = findViewById(R.id.tv_jogador1);
        tv_jogador2 = findViewById(R.id.tv_jogador2);
        btt_reset = findViewById(R.id.btt_reset);
        btt_somaJogador1 = findViewById(R.id.btt_jogador1adicao);
        btt_somaJogador2 = findViewById(R.id.btt_jogador2adicao);
        btt_subtracaoJogador1 = findViewById(R.id.btt_jogador1subtracao);
        btt_subtracaoJogador2 = findViewById(R.id.btt_jogador2subtracao);
    }

}
