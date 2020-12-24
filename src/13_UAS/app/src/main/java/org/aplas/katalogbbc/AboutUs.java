package org.aplas.katalogbbc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
    }

    public void backtomainmenu(View view) {
        Intent i = new Intent(AboutUs.this, MainActivity.class);
        startActivity(i);
    }
}