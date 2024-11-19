package com.example.aptechka;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);

        Button perehod3 = (Button) findViewById(R.id.perehod3);
        perehod3.setOnClickListener(this);

    }
    @Override
    public void onClick (View v) {
        Intent perehod3 =new Intent(MainActivity4.this, MainActivity6.class);
        startActivity(perehod3);
    }

}
