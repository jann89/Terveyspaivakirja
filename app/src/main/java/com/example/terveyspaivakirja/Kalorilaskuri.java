package com.example.terveyspaivakirja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalorilaskuri extends AppCompatActivity {

    Button nappi;
    EditText aamu;
    EditText lounas;
    EditText paiva;
    TextView kalorit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalorilaskuri);

        //Linkitetään edittextit
        miau();

    }
    public void miau(){

        aamu = ((EditText) findViewById(R.id.aamupala));
        lounas = ((EditText) findViewById(R.id.lounas));
        paiva = ((EditText) findViewById(R.id.paivallinen));
        nappi=(Button) findViewById(R.id.button3);
        kalorit = (TextView) findViewById(R.id.kalorit);
        kalorit.setText("0");
        nappi.setOnClickListener(v -> {

            int luku1 = Integer.parseInt(aamu.getText().toString());
            int luku2 = Integer.parseInt(lounas.getText().toString());
            int luku3 = Integer.parseInt(paiva.getText().toString());
            int summa = luku1 + luku2 +luku3;
            kalorit.setText(Integer.toString(summa));

        });

    }
}

