package com.rameda.pontosdevidamagicthegathering;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    TextView tv_jogador1,tv_jogador2;
    public int valor1 = 20;
    public int valor2 = 20;

    Button btt_somaJogador1,btt_somaJogador2,btt_subtracaoJogador1,btt_subtracaoJogador2;
    FloatingActionButton fabReset,fab_4playes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Banners();
        invocacao();
        fabReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                valor1 = 20;
                valor2 = 20;
                tv_jogador1.setText(""+valor1);
                tv_jogador2.setText(""+valor2);
            }
        });
        fab_4playes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chamar = new Intent(getApplicationContext(),tresJogadores.class);
                startActivity(chamar);
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

    private void Banners() {
        // Load an ad into the AdMob banner view.
        AdView adView2 = (AdView) findViewById(R.id.adViewBoton);
        AdRequest adRequest2 = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView2.loadAd(adRequest2);


        // Load an ad into the AdMob banner view.
        AdView adView = (AdView) findViewById(R.id.adViewTop);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);
    }

    void invocacao(){
        tv_jogador1 = findViewById(R.id.tv_jogador1);
        tv_jogador2 = findViewById(R.id.tv_jogador2);
        //btt_reset = findViewById(R.id.btt_reset);
       fabReset = findViewById(R.id.fab_reset);
       fab_4playes = findViewById(R.id.fab_4players);
        btt_somaJogador1 = findViewById(R.id.btt_jogador1adicao);
        btt_somaJogador2 = findViewById(R.id.btt_jogador2adicao);
        btt_subtracaoJogador1 = findViewById(R.id.btt_jogador1subtracao);
        btt_subtracaoJogador2 = findViewById(R.id.btt_jogador2subtracao);
    }

}
