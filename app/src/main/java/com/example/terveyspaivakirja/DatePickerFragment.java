package com.example.terveyspaivakirja;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;

import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

/**
* Fragment päivämäärän valintaan. Luodaan kun ylävalikosta painaa kalenterin kuvaketta
* @author tammipuu
*/
public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    /**
     * Palauttaa päivämäärädialogin, joka näytetään ruudulla
     * @param savedInstanceState instanssin tila
     * @return uusi DatePickerDialog-objekti
     */
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    /**
     * Suoritetaan kun päivämäärä valitaan. Tulisi asettaa päivämäärätiedot erilliseen
     * luokkaan ja kutsua metodia, jolla päivitetään näkymä.
     * @param view DatePicker-objekti
     * @param year Palautettu vuosi
     * @param month Palautettu kuukausi
     * @param day Palautettu päivä
     */
    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {

    }
}
