package com.rameda.pontosdevidamagicthegathering;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.getbase.floatingactionbutton.FloatingActionButton;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class tresJogadores extends AppCompatActivity {

    TextView tv_jogador1, tv_jogador2, tv_jogador3, tv_jogador4;
    public int valor1 = 20;
    public int valor2 = 20;
    public int valor3 = 20;
    public int valor4 = 20;
    int n = 0;

    Button btt_somaJogador1, btt_somaJogador2, btt_subtracaoJogador1, btt_subtracaoJogador2, btt_somaJogador3, btt_somaJogador4, btt_subtracaoJogador3, btt_subtracaoJogador4;
    ImageView iv_jogador1, iv_jogador2, iv_jogador3, iv_jogador4;
    FloatingActionButton fabReset ;
    public int[] arrayImage = {
            R.drawable.arvoreverde,
            R.drawable.azul2,
            R.drawable.branco,
            R.drawable.liliana,
            R.drawable.red,
            R.drawable.principal,
            R.drawable.branco2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres_jogadores);
        invocacao();

        fabReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                valor1 = 20;
                valor2 = 20;
                valor3 = 20;
                valor4 = 20;
                tv_jogador1.setText(""+valor1);
                tv_jogador2.setText(""+valor2);
                tv_jogador3.setText(""+valor3);
                tv_jogador4.setText(""+valor4);
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

        btt_somaJogador4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    valor4 = valor4 + 1;
                    tv_jogador4.setText("" + valor4);
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
        btt_subtracaoJogador4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    valor4 = valor4 - 1;

                    tv_jogador4.setText("" + valor4);

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
//                iv_jogador1.setImageResource(arrayImage[n]);

            }
        });
        tv_jogador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n = n + 1;
                if (n == 7) {
                    n = 0;
                }
             //   iv_jogador2.setImageResource(arrayImage[n]);

            }
        });
        tv_jogador3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n = n + 1;
                if (n == 7) {
                    n = 0;
                }
            //    iv_jogador3.setImageResource(arrayImage[n]);

            }
        });
        tv_jogador4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n = n + 1;
                if (n == 7) {
                    n = 0;
                }
            //    iv_jogador4.setImageResource(arrayImage[n]);


            }
        });
    }

    void invocacao() {
        tv_jogador1 = findViewById(R.id.tv_jogador1);
        tv_jogador2 = findViewById(R.id.tv_jogador2);
        tv_jogador3 = findViewById(R.id.tv_jogador3);
        tv_jogador4 = findViewById(R.id.tv_jogador4);
        //btt_reset = findViewById(R.id.btt_reset);
        fabReset = findViewById(R.id.btt_reset4);
        btt_somaJogador1 = findViewById(R.id.btt_pontosvidajogador1mais);
        btt_somaJogador2 = findViewById(R.id.btt_pontosvidajogador2mais);
        btt_somaJogador3 = findViewById(R.id.btt_pontosvidajogador3mais);
        btt_somaJogador4 = findViewById(R.id.btt_pontosvidajogador4mais);
        btt_subtracaoJogador1 = findViewById(R.id.btt_pontosvidajogador1menos);
        btt_subtracaoJogador2 = findViewById(R.id.btt_pontosvidajogador2menos);
        btt_subtracaoJogador3 = findViewById(R.id.btt_pontosvidajogador3menos);
        btt_subtracaoJogador4 = findViewById(R.id.btt_pontosvidajogador4menos);
        /*iv_jogador1 = findViewById(R.id.iv_jogador1);
        iv_jogador2 = findViewById(R.id.iv_jogador2);
        iv_jogador3 = findViewById(R.id.iv_jogador3);
        iv_jogador4 = findViewById(R.id.iv_jogador4);*/
    }


    private void Banners() {
        // Load an ad into the AdMob banner view.
        AdView adView2 = (AdView) findViewById(R.id.adViewbotto4);
        AdRequest adRequest2 = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView2.loadAd(adRequest2);


        // Load an ad into the AdMob banner view.
        AdView adView = (AdView) findViewById(R.id.adViewtop4);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);
    }
}
