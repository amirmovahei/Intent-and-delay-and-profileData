package com.example.mynewapplication;

import static java.lang.Integer.*;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int defuiltSize = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView label = findViewById(R.id.headtxt);
        Button btnb = findViewById(R.id.btnblue);
        Button btnr = findViewById(R.id.btnred);
        Button btng = findViewById(R.id.btngreen);
        Button btnpink = findViewById(R.id.btnpink);
        Button btnpourple = findViewById(R.id.btnpourple);
        Button btnyelow = findViewById(R.id.btnyelow);
        Button btnminus = findViewById(R.id.btnminus);
        Button btnplas = findViewById(R.id.btnplas);
        Button btn=findViewById(R.id.btnintent);
        EditText edt_family=findViewById(R.id.edt_family);
        EditText edt_name=findViewById(R.id.edt_name);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one=new Intent(MainActivity.this, ProfileData.class);
                String nam=edt_name.getText().toString();
                String family=edt_family.getText().toString();
                one.putExtra("name",nam);
                one.putExtra("family",family);
                startActivity(one);
            }
        });


        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                label.setTextColor(Color.rgb(0, 0, 255));
                label.setTextSize(50);
                label.setText("این چه بلایی بود بر سر ما امد");


            }
        });

        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                label.setTextColor(Color.rgb(0, 255, 0));
                label.setTextSize(50);
                label.setText("ناهار چی می خوای بزاری ");


            }
        });
        btnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                label.setTextColor(Color.rgb(255, 0, 0));
                label.setTextSize(50);
                label.setText("چطوری کلکپیس");


            }
        });
        btnyelow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                label.setTextColor(Color.rgb(255, 255, 0));
                label.setTextSize(50);
                label.setText("چرا تلفن جواب نمی دید عههههه!:/");


            }
        });

        btnpink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                label.setTextColor(Color.parseColor("#E91E63"));
                label.setTextSize(50);
                label.setText("ریدم توی اراد برندینگ که انقدر....");

            }
        });
        btnpourple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                label.setTextColor(Color.parseColor("#9C27B0"));
                label.setTextSize(100);
                label.setText("حقوقا رو ندادن ؟:/");


            }
        });

        btnplas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                label.setTextSize(defuiltSize += 3);
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                label.setTextSize(defuiltSize -= 3);
            }
        });


    }
}