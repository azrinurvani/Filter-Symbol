package com.mobile.azrinurvani.filtersymbol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testDenganSimbol();
        testTanpaSimbol();
    }

    private void testDenganSimbol() {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("I am a string-");
        boolean b = m.find();


        if (b)//b==true
            Log.d(TAG, "test1: "+"ada simbol");
        else
            Log.d(TAG, "test1: "+"tidak ada simbol");

    }

    private void testTanpaSimbol() {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("I am a string");
        boolean b = m.find();

        if (b)
            Log.d(TAG, "test2: "+"ada simbol");
        else
            Log.d(TAG, "test2: "+"tidak ada simbol");
    }
}
