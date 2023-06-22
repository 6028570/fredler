package com.example.fledler;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Set the layout resource file for the activity
        // Additional initialization or logic can be added here

        ImageView settingsImageView = findViewById(R.id.settings);
        settingsImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform the desired action when the ImageView is clicked
                // For example, start a new activity or navigate to another project file
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);

            }
        });

        CardView cardView4 = findViewById(R.id.cardView4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform the desired action when the CardView is clicked
                // For example, show a toast message
                Intent intent = new Intent(MainActivity.this, badkamerActivity.class);
                startActivity(intent);            }
        });
        CardView cardView = findViewById(R.id.cardView);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform the desired action when the CardView is clicked
                // For example, show a toast message
                Intent intent = new Intent(MainActivity.this, toilet.class);
                startActivity(intent);            }
        });
        CardView cardView3 = findViewById(R.id.cardView3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform the desired action when the CardView is clicked
                // For example, show a toast message
                Intent intent = new Intent(MainActivity.this, garage.class);
                startActivity(intent);            }
        });
        CardView cardView6 = findViewById(R.id.cardView6);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform the desired action when the CardView is clicked
                // For example, show a toast message
                Intent intent = new Intent(MainActivity.this, keuken.class);
                startActivity(intent);            }
        });
        CardView cardView2 = findViewById(R.id.cardView2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform the desired action when the CardView is clicked
                // For example, show a toast message
                Intent intent = new Intent(MainActivity.this, woonkamer.class);
                startActivity(intent);            }
        });
        CardView cardView8 = findViewById(R.id.cardView8);
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform the desired action when the CardView is clicked
                // For example, show a toast message
                Intent intent = new Intent(MainActivity.this, slaapkamer.class);
                startActivity(intent);            }
        });




    }
}
