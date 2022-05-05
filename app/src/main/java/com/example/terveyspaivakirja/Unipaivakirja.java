package com.example.terveyspaivakirja;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
/**Janne*/
public class Unipaivakirja extends AppCompatActivity {
    /**Seekbarien ja textview julistus*/
    private SeekBar laatumittari;
    private SeekBar tuntimittari;
    private SeekBar virkeysmittari;
    private TextView keskiarvo;
    @Override
        protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.unipaivakirja);

        /**unimittareiden current value*/
        SeekBar laatumittari = (SeekBar) findViewById(R.id.laatumittari);
        int currentValue = laatumittari.getProgress();
        SeekBar tuntimittari = (SeekBar) findViewById(R.id.tuntimittari);
        int currentValue2 = tuntimittari.getProgress();
        SeekBar virkeysmittari = (SeekBar) findViewById(R.id.virkeysmittari);
        int currentValue3 = virkeysmittari.getProgress();

        /**mittareiden keskiarvon laskeminen eli "uni-indexi"*/
        int total = 0;
        total += laatumittari.getProgress();
        total += tuntimittari.getProgress();
        total += virkeysmittari.getProgress();
        int average = total / 3;
        keskiarvo.setText(Integer.toString(average));
        }
}


