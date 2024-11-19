package com.example.aptechka;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        Button perehod = (Button) findViewById(R.id.perehod);
        perehod.setOnClickListener(this);

        Button perehod2 = (Button) findViewById(R.id.perehod2);
        perehod2.setOnClickListener(this::onClick2);


    }
    @Override
    public void onClick (View v) {
        Intent perehod =new Intent(MainActivity3.this, MainActivity4.class);
        startActivity(perehod);
    }
    public void onClick2 (View v) {
        Intent perehod2 =new Intent(MainActivity3.this, MainActivity5.class);
        startActivity(perehod2);
    }
}

