package com.rameda.pontosdevidamagicthegathering;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tv_jogador1,tv_jogador2,tv_count,tv_count2;
    public int valor1 = 20;
    public int valor2 = 20;
    public ImageView iv_dados,iv_dados2;
    public  int a = 0;

    Button btt_somaJogador1,btt_somaJogador2,btt_subtracaoJogador1,btt_subtracaoJogador2;
    FloatingActionButton fabReset,fab_4playes;
    FloatingActionButton fab_Tres,fab_dado;
    private InterstitialAd mInterstitialAd;
    boolean show = true;
    int[] dados = new int[]{R.drawable.dado1,R.drawable.dado2,R.drawable.dado3,R.drawable.dado4,R.drawable.dado5,R.drawable.dado6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Banners();
        invocacao();
        iv_dados2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int a = rand.nextInt(5);
                iv_dados2.setImageResource(dados[a+1]);
            }
        });

        iv_dados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
            int n = rand.nextInt(5);
            iv_dados.setImageResource(dados[n+1]);
            }
        });

        fab_dado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(show){
                    iv_dados.setVisibility(View.VISIBLE);
                    iv_dados2.setVisibility(View.VISIBLE);
                    show = false;
                }else{
                    iv_dados.setVisibility(View.INVISIBLE);
                    iv_dados2.setVisibility(View.INVISIBLE);
                    show = true;
                }
            }
        });


        fabReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                valor1 = 20;
                valor2 = 20;
                tv_jogador1.setText(""+valor1);
                tv_jogador2.setText(""+valor2);

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
        fab_4playes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chamar = new Intent(getApplicationContext(),QuatroJogadores.class);
                startActivity(chamar);
            }
        });
        fab_Tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chamar = new Intent(getApplicationContext(),TresPlayes.class);
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

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-0130794426426264/5758389334");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }

    void invocacao(){
        tv_jogador1 = findViewById(R.id.tv_jogador1);
        tv_jogador2 = findViewById(R.id.tv_jogador2);
        //btt_reset = findViewById(R.id.btt_reset);
       fabReset = findViewById(R.id.fab_reset);
       fab_4playes = findViewById(R.id.fab_4players);
        fab_Tres = findViewById(R.id.fab_Tres);
        btt_somaJogador1 = findViewById(R.id.btt_jogador1adicao);
        btt_somaJogador2 = findViewById(R.id.btt_jogador2adicao);
        btt_subtracaoJogador1 = findViewById(R.id.btt_jogador1subtracao);
        btt_subtracaoJogador2 = findViewById(R.id.btt_jogador2subtracao);
        iv_dados = findViewById(R.id.iv_dados);
        iv_dados2 = findViewById(R.id.iv_dados8);
        fab_dado = findViewById(R.id.fab_Dados);
       /* tv_count = findViewById(R.id.tv_count);
        tv_count2 = findViewById(R.id.tv_count2);*/
    }

}
