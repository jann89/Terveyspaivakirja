package com.example.terveyspaivakirja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView selectedDate;
    private TextView caloriesGot;
    private TextView caloriesLeft;
    private SharedPreferences data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        data = getSharedPreferences("data", Activity.MODE_PRIVATE);
        selectedDate = findViewById(R.id.selectedDate);

        DaySelection.getInstance();
        update();
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
        switch(item.getItemId()) {
            case R.id.date_picker:
                showDatePickerDialog();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void update() {
        selectedDate.setText(DaySelection.getInstance().getDay() + "." + DaySelection.getInstance().getMonth() + "." + DaySelection.getInstance().getYear());
        caloriesGot.setText(Integer.toString(data.getInt("obtainedCalories_" + DaySelection.getInstance().getDay() + DaySelection.getInstance().getMonth() + DaySelection.getInstance().getYear(), 0)));
        caloriesLeft.setText(Integer.toString(data.getInt("caloriesLeft_" + DaySelection.getInstance().getDay() + DaySelection.getInstance().getMonth() + DaySelection.getInstance().getYear(), 0)));
    }
}