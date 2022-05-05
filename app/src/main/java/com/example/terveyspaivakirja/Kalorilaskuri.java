package com.example.terveyspaivakirja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**Eetu*/
public class Kalorilaskuri extends AppCompatActivity {
    /**Luopdaan nappi ja EditTexitit ja view:t*/
    private Button nappi;
    private EditText aamu;
    private EditText lounas;
    private EditText paiva;
    private EditText vali;
    private TextView kalorit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalorilaskuri);

        /**Kutsutaan LaskeKalorit metodi*/
        LaskeKalorit();
    }

    public void LaskeKalorit() {
        /**Yhdistetään kaikki oikeisiin*/
        aamu = ((EditText) findViewById(R.id.aamupala));
        lounas = ((EditText) findViewById(R.id.lounas));
        paiva = ((EditText) findViewById(R.id.paivallinen));
        vali = ((EditText) findViewById(R.id.valipala));
        nappi = (Button) findViewById(R.id.button3);
        kalorit = (TextView) findViewById(R.id.kalorit);
        kalorit.setText("0");
        nappi.setOnClickListener(v -> {
            /**Tehdään muuttujat, jotka hakavet arvot edittext kentistä*/
            int luku1 = Integer.parseInt(aamu.getText().toString());
            int luku2 = Integer.parseInt(lounas.getText().toString());
            int luku3 = Integer.parseInt(paiva.getText().toString());
            int luku4 = Integer.parseInt(vali.getText().toString());
            int summa = luku1 + luku2 + luku3 + luku4;
            /**Lisätään summa kalorit kenttään*/
            kalorit.setText(Integer.toString(summa));

        });
    }

    public void onButtonClick(View view) {
        /**Haetaan dataa kalorikentästä*/
        String tieto = kalorit.getText().toString();
        /**Tehdään intent millä avataan mainacitivity*/
        Intent i = new Intent(Kalorilaskuri.this, MainActivity.class);
        /**Laitetaan data intenttiin*/
        i.putExtra("21", tieto);
        /**Aloitetaan mainactivity*/
        startActivity(i);
    }


}


