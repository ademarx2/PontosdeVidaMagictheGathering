package com.rameda.pontosdevidamagicthegathering;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TresPlayes extends AppCompatActivity {



    TextView tv_jogador1, tv_jogador2, tv_jogador3, tv_jogador4;
    public int valor1 = 20;
    public int valor2 = 20;
    public int valor3 = 20;

    int n = 0;

    Button btt_somaJogador1, btt_somaJogador2, btt_subtracaoJogador1,
            btt_subtracaoJogador2, btt_somaJogador3, btt_subtracaoJogador3;
    FloatingActionButton fabReset ;
    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-0130794426426264/3487804438");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_tres_playes);
        invocacao();

        fabReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                valor1 = 20;
                valor2 = 20;
                valor3 = 20;
                tv_jogador1.setText("" + valor1);
                tv_jogador2.setText("" + valor2);
                tv_jogador3.setText("" + valor3);

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }


            }
        });





        btt_somaJogador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    valor1 = valor1 + 1;
                    tv_jogador1.setText("" + valor1);
                } catch (Exception e) {
                }
            }
        });
        btt_somaJogador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    valor2 = valor2 + 1;
                    tv_jogador2.setText("" + valor2);
                } catch (Exception e) {
                }
            }
        });
        btt_somaJogador3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    valor3 = valor3 + 1;
                    tv_jogador3.setText("" + valor3);
                } catch (Exception e) {
                }
            }
        });


        btt_subtracaoJogador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    valor1 = valor1 - 1;

                    tv_jogador1.setText("" + valor1);

                } catch (Exception e) {
                }

            }
        });
        btt_subtracaoJogador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    valor2 = valor2 - 1;
                    tv_jogador2.setText("" + valor2);

                } catch (Exception e) {
                }
            }
        });
        btt_subtracaoJogador3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    valor3 = valor3 - 1;
                    tv_jogador3.setText("" + valor3);

                } catch (Exception e) {
                }

            }
        });


        tv_jogador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n = n + 1;
                if (n == 7) {
                    n = 0;
                }
            }
        });
        tv_jogador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n = n + 1;
                if (n == 7) {
                    n = 0;
                }
            }
        });
        tv_jogador3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n = n + 1;
                if (n == 7) {
                    n = 0;
                }
            }
        });
    }
        void invocacao () {
            tv_jogador1 = findViewById(R.id.ttv_jogador1);
            tv_jogador2 = findViewById(R.id.ttv_jogador2);
            tv_jogador3 = findViewById(R.id.ttv_jogador3);

            //btt_reset = findViewById(R.id.btt_reset);
            fabReset = findViewById(R.id.btt_reset4);
            btt_somaJogador1 = findViewById(R.id.bbtt_pontosvidajogador1mais);
            btt_somaJogador2 = findViewById(R.id.bbtt_jogador2adicao);
            btt_somaJogador3 = findViewById(R.id.bbtt_pontosvidajogador3mais);
            btt_subtracaoJogador1 = findViewById(R.id.bbtt_pontosvidajogador1menos);
            btt_subtracaoJogador2 = findViewById(R.id.bbtt_jogador2subtracao);
            btt_subtracaoJogador3 = findViewById(R.id.bbtt_pontosvidajogador3menos);
        /*iv_jogador1 = findViewById(R.id.iv_jogador1);
        iv_jogador2 = findViewById(R.id.iv_jogador2);
        iv_jogador3 = findViewById(R.id.iv_jogador3);
        iv_jogador4 = findViewById(R.id.iv_jogador4);*/
        }
    }
