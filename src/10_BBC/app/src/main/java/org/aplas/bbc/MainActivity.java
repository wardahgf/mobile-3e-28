package org.aplas.bbc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import org.aplas.bbc.databinding.ActivityMainBinding;
import org.aplas.bbc.modals.Modal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Modal m = new Modal("Skin Type","Tidak Berminyak kekeringan berlebih mempercepat penuaan");
        binding.setModel(m);
    }

}