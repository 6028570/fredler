package com.example.fledler;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ImageView settingsImageView = findViewById(R.id.back);
        settingsImageView.setOnClickListener(view -> {
            // Perform the desired action when the ImageView is clicked
            // For example, start a new activity or navigate to another project file
            Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
            startActivity(intent);
        });

    }
}
