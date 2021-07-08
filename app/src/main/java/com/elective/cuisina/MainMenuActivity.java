package com.elective.cuisina;

import android.view.View;
import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainMenuActivity extends AppCompatActivity {

private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_screen);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });
    }

public void openHomeActivity(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        }
}