package com.example.terveyspaivakirja;

import java.util.Calendar;

public class DaySelection {
    private static DaySelection daySelection = new DaySelection();
    private int year;
    private int month;
    private int day;

    public static DaySelection getInstance() {
        return daySelection;
    }

    private DaySelection() {
        final Calendar c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
