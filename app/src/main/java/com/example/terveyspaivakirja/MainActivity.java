package com.example.terveyspaivakirja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedinstancestate) {
        super.onCreate(savedinstancestate);
        setContentView(R.layout.activity_main);
        TextView miau = (TextView) findViewById(R.id.miau);
        Button btn = (Button) findViewById(R.id.button);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("21");
            //The key argument here must match that used in the other activity
            miau.setText(value);

        }
        btn.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Kalorilaskuri.class));


        });
    }
}




