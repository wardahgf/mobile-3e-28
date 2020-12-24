package org.aplas.katalogbbc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BodycareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodycare);
    }

    public void backtomainmenu(View view) {
        Intent i = new Intent(BodycareActivity.this, MainActivity.class);
        startActivity(i);
    }
}