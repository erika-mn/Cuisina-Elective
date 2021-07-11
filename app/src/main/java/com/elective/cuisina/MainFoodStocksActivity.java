package com.elective.cuisina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainFoodStocksActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_food_stocks);

        button = (Button) findViewById(R.id.buttonFruitsActivity);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openFruitsActivity();
            }
        });
    }

    public void openFruitsActivity(){
        Intent intent = new Intent(this, zFruitsmain.class);
        startActivity(intent);
    }
}