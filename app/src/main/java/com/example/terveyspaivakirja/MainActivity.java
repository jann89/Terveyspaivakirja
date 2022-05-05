package com.example.terveyspaivakirja;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    /**OnResumelle kutsutaan kalorit metodi*/
    protected void onResume() {
        super.onResume();
        kalorit();
        kalorilasku();

    }

    public void showDatePickerDialog() {
        DialogFragment fragment = new DatePickerFragment();
        fragment.show(getSupportFragmentManager(), "datePicker");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.date_picker:
                showDatePickerDialog();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**Eetu*/
    public void onButtonClick(View view) {
        Intent i = new Intent(MainActivity.this, Kalorilaskuri.class);
        startActivity(i);
    }

    /**Eetu*/
    public void onButtonClick2(View view) {
        Intent u = new Intent(MainActivity.this, UnipaivakirjaEetu.class);
        startActivity(u);
    }


    /**Eetu*/
    public void kalorit() {
        //Haetaan Textview
        TextView tv = findViewById(R.id.textView6);
        //Haetaan intent Kalorilaskurista ,joka sisältää päivän kalorit
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("21");
            //Asetetaan intentin arvo tv textview:hin
            tv.setText(value);
        }

    }

    /**Eetu*/
    public void kalorilasku() {
        TextView tv2 = findViewById(R.id.textView8);
        TextView tv3 = findViewById(R.id.textView9);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("21");
            //Aikaisempi sama koodi kuin yllä
            //Lisätään 3 muuttujaa joilla lasketaan päivänkalorin saanti suosituksesta
            int luku = Integer.parseInt(value);
            int luku2 = 2000;
            int lasku = luku2 - luku;
            String laskus = String.valueOf(lasku);
            if (lasku > 0) {
                tv2.setText(laskus);
            } else {
                tv2.setText("0");
                tv3.setText("Päivän kalorit syöty!");
            }
        }
    }


}