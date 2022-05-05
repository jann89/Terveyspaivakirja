package com.example.terveyspaivakirja;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Unipaivakirja2 extends AppCompatActivity {
    SeekBar laatumittari;
    SeekBar tuntimittari;
    SeekBar virkeysmittari;
    TextView keskiarvo;
    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.unipaivakirja);

        //mittareiden currentvalue
        SeekBar laatumittari = (SeekBar) findViewById(R.id.laatumittari);
        int currentValue = laatumittari.getProgress();
        SeekBar tuntimittari = (SeekBar) findViewById(R.id.tuntimittari);
        int currentValue2 = tuntimittari.getProgress();
        SeekBar virkeysmittari = (SeekBar) findViewById(R.id.virkeysmittari);
        int currentValue3 = virkeysmittari.getProgress();

        //mittareiden keskiarvon laskeminen eli "uni-indeksi"
        int total = 0;
        total += laatumittari.getProgress();
        total += tuntimittari.getProgress();
        total += virkeysmittari.getProgress();
        int average = total / 3;
        keskiarvo.setText(Integer.toString(average));
    }
}


