package com.example.mynewapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class thirdpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_thirdpage);

        String[] array = new String[]{"اراک", "قم", "تهران", "اصفهان", "شیراز"};
        String[] adad = {"086", "025", "021", "031", "061"};

        ListView lv1 = findViewById(R.id.listview1);
        ArrayAdapter ada = new ArrayAdapter(this, android.R.layout.simple_list_item_1, array);
        lv1.setAdapter(ada);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) Toast.makeText(thirdpage.this, "086", Toast.LENGTH_SHORT).show();
                Log.d("tag","amir");
            }

        });

    }
}