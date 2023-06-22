package com.example.fledler;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class badkamerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.badkamer);

        ImageView settingsImageView = findViewById(R.id.imageView2);
        settingsImageView.setOnClickListener(view -> {
            // Perform the desired action when the ImageView is clicked
            // For example, navigate back to MainActivity
            Intent intent = new Intent(badkamerActivity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Clear the activity stack
            startActivity(intent);
        });


    }
}
