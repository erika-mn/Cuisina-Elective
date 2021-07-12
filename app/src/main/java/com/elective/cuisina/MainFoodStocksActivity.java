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

        button = (Button) findViewById(R.id.buttonMeatActivity);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMeatActivity();
            }
        });

        button = (Button) findViewById(R.id.buttonDairyActivity);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openDairyActivity();
            }
        });

        button = (Button) findViewById(R.id.buttonVegetableActivity);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openVegetablesActivity();
            }
        });

        button = (Button) findViewById(R.id.buttonCondimentsActivity);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openCondimentsActivity();
            }
        });
    }

    public void openFruitsActivity(){
        Intent intent = new Intent(this, zFruitsmain.class);
        startActivity(intent);
    }

    public void openMeatActivity(){
        Intent intent = new Intent(this, yMeatmain.class);
        startActivity(intent);
    }

    public void openDairyActivity(){
        Intent intent = new Intent(this, xDairymain.class);
        startActivity(intent);
    }

    public void openVegetablesActivity(){
        Intent intent = new Intent(this, wVegetablesmain.class);
        startActivity(intent);
    }

    public void openCondimentsActivity(){
        Intent intent = new Intent(this, vCondimentsmain.class);
        startActivity(intent);
    }
}