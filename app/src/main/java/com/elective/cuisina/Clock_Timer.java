package com.elective.cuisina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Clock_Timer extends AppCompatActivity {

    ImageButton imgbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock_timer);

        imgbutton = (ImageButton) findViewById(R.id.Backbtn);
        imgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openHomeClock();
            }
        });


    }

    public void openHomeClock() {
        Intent intent = new Intent(this, HomeClock.class);
        startActivity(intent);
    }
}