package com.example.mynewapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splashscreen);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;



        });
        Button splash=findViewById(R.id.btnsplash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent amir=new Intent(splashscreen.this, MainActivity.class);
                startActivity(amir);
                finish();
            }
        },5000);
        splash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent amir=new Intent(splashscreen.this, MainActivity.class);
                startActivity(amir);
            }


        });


    }
}