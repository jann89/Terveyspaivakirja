package com.example.terveyspaivakirja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class UnipaivakirjaEetu extends AppCompatActivity {
    SeekBar unimaara;
    SeekBar unilaatu;
    SeekBar univirkeys;
    TextView tv;
    TextView laatu;
    TextView virkeys;
    TextView maara;
    TextView unindex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unipaivakirja_eetu);

        unimaara = (SeekBar) findViewById(R.id.seekbar1);
        univirkeys = (SeekBar) findViewById(R.id.seekbar2);
        unilaatu = (SeekBar) findViewById(R.id.seekbar3);
        tv = (TextView) findViewById(R.id.textView);
        laatu = (TextView) findViewById(R.id.virke);
        virkeys = (TextView) findViewById(R.id.laatu);
        maara = (TextView) findViewById(R.id.uni);
        unindex = (TextView) findViewById(R.id.uniindex);
        unimaara.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                maara.setText("" + i);
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
                laatu.setText("" + i);
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
                virkeys.setText("" + i);
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

        int luku1 = Integer.parseInt((String) laatu.getText());
        int luku2 = Integer.parseInt((String) virkeys.getText());
        int luku3 = Integer.parseInt((String) maara.getText());
        int summa = luku1 + luku2 + luku3;
        unindex.setText("" + summa);

    }

}

