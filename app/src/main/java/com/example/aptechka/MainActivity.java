package com.example.aptechka;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
private final int pauze=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent first=new Intent(MainActivity.this, MainActivity3.class);
                MainActivity.this.startActivity(first);
                MainActivity.this.finish();
            }
        },

        pauze);
    }
}