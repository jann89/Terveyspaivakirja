package com.example.terveyspaivakirja;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Fragment yleisnäkymälle, ei tee mitään erikoista
 * @author tammipuu
 */
public class DiaryFragment extends Fragment {
    Button button;
    public DiaryFragment() {
        super(R.layout.diary_fragment);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}

