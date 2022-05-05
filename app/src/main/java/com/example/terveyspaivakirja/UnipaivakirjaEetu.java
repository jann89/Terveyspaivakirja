package com.example.terveyspaivakirja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
//*Eetu*
public class UnipaivakirjaEetu extends AppCompatActivity {
    //Seekbarien ja textviewden julistus
    private SeekBar unimaara;
    private SeekBar unilaatu;
    private SeekBar univirkeys;
    private TextView tv;
    private TextView laatu;
    private TextView virkeys;
    private TextView maara;
    private TextView unindex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unipaivakirja_eetu);

        //Yhdistetään kaikki layoutissa oleviin
        unimaara = (SeekBar) findViewById(R.id.seekbar1);
        univirkeys = (SeekBar) findViewById(R.id.seekbar2);
        unilaatu = (SeekBar) findViewById(R.id.seekbar3);
        tv = (TextView) findViewById(R.id.textView);
        laatu = (TextView) findViewById(R.id.virke);
        virkeys = (TextView) findViewById(R.id.textviewuni);
        maara = (TextView) findViewById(R.id.uni);
        unindex = (TextView) findViewById(R.id.uniindex);

        //Käytetään jokaiselle omaa OnSeekBarChangeListener
        unimaara.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                //Muutetaan textiä textviewssä sen mukaan missä asennossa seekbar on
                maara.setText(Integer.toString(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        unilaatu.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                laatu.setText(Integer.toString(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        univirkeys.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                virkeys.setText(Integer.toString(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
    public void onButtonClick(View view){
        //Nappia painettaessa lasketaan uniindex
        int luku1 = Integer.parseInt((String) laatu.getText());
        int luku2 = Integer.parseInt((String) virkeys.getText());
        int luku3 = Integer.parseInt((String) maara.getText());
        int summa = luku1 + luku2 + luku3;
        int index = summa / 3;
        unindex.setText(Integer.toString(index));

    }


}

