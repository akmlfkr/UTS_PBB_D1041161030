package com.example.utsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class halaman1new extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman1new);

        Button btn = (Button) findViewById(R.id.bt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent il = new Intent(getApplicationContext(), Detail1.class);
                startActivity(il);
            }
        });
    }

    public void openDetail1() {
        Intent intent = new Intent(this, Detail1.class);
        startActivity(intent);
    }
}