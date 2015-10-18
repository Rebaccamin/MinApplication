package com.example.wu_.minapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Second_ extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.second);
            Intent intent=getIntent();
            final String data=intent.getStringExtra("extra_data");
            Button B3=(Button)findViewById(R.id.button_3);
            B3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Second_.this,data,Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

