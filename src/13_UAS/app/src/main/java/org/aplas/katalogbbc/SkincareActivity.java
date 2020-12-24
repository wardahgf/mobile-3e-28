package org.aplas.katalogbbc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SkincareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skincare);
    }

    public void backtomainmenu(View view) {
        Intent i = new Intent(SkincareActivity.this, MainActivity.class);
        startActivity(i);
    }

    public void glowClick(View view) {
        Intent i = new Intent(SkincareActivity.this, glow.class);
        startActivity(i);
    }

    public void acneClick(View view) {
        Intent i = new Intent(SkincareActivity.this, acne.class);
        startActivity(i);
    }
}