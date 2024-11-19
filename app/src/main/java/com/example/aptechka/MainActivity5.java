package com.example.aptechka;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);

        Button perehod4 = (Button) findViewById(R.id.perehod4);
        perehod4.setOnClickListener(this);

    }
    @Override
    public void onClick (View v) {
        Intent perehod4 =new Intent(MainActivity5.this, MainActivity7.class);
        startActivity(perehod4);
    }

}