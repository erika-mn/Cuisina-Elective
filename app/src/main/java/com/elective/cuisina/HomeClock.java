package com.elective.cuisina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeClock extends AppCompatActivity {
    Button button;
    ImageButton imgbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_clock);

        button = (Button) findViewById(R.id.AlarmBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openAlarmActivity();
            }
        });

        button = (Button) findViewById(R.id.TimerBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openTimerActivity();
            }
        });

    }

    public void openAlarmActivity() {
        Intent intent = new Intent(this, Clock_Alarm.class);
        startActivity(intent);
    }

    public void openTimerActivity() {
        Intent intent = new Intent(this, Clock_Timer.class);
        startActivity(intent);
    }
}