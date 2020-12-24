package org.aplas.katalogbbc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void skincareClick(View view) {
        Intent i = new Intent(MainActivity.this, SkincareActivity.class);
        startActivity(i);
    }

    public void bodycareClick(View view) {
        Intent i = new Intent(MainActivity.this, BodycareActivity.class);
        startActivity(i);
    }


    public void aboutClick(View view) {
        Intent i = new Intent(MainActivity.this, AboutUs.class);
        startActivity(i);
    }

    public void skintypeClick(View view) {
        Intent i = new Intent(MainActivity.this, typeskin.class);
        startActivity(i);
    }
}