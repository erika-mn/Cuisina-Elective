package com.elective.cuisina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class FruitsActivity extends AppCompatActivity {

    private Button button;
    private ArrayList<String> data = new ArrayList<String>();
    private ArrayList<String> data1 = new ArrayList<String>();
    private ArrayList<String> data2 = new ArrayList<String>();
    private TableLayout table;

    EditText ed1, ed2, ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed3 = findViewById(R.id.ed3);

        button = findViewById(R.id.button_add);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add_data();
            }
        });

        button = findViewById(R.id.button_delete);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delete_data();
            }
        });
    }

    public void add_data() {

        String ingredient_name = ed1.getText().toString();
        int quantity = Integer.parseInt(ed2.getText().toString());
        String expiration_date = ed3.getText().toString();

        data.add(ingredient_name);
        data1.add(String.valueOf(quantity));
        data2.add(expiration_date);

        TableLayout table = (TableLayout) findViewById(R.id.table);
        TableRow row = new TableRow(this);
        TextView t1 = new TextView(this);
        TextView t2 = new TextView(this);
        TextView t3 = new TextView(this);

        for (int i = 0; i < data.size(); i++) {
            String ingredient_names = data.get(i);
            String quantities = data1.get(i);
            String expiration_dates = data2.get(i);

            t1.setText(ingredient_names);
            t2.setText(quantities);
            t3.setText(expiration_dates);
        }

        row.addView(t1);
        row.addView(t2);
        row.addView(t3);
        table.addView(row);

        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
    }

    public void delete_data() {

        String ingredient_name = ed1.getText().toString();
        int quantity = Integer.parseInt(ed2.getText().toString());
        String expiration_date = ed3.getText().toString();

        data.add(ingredient_name);
        data1.add(String.valueOf(quantity));
        data2.add(expiration_date);

        TableLayout table = (TableLayout) findViewById(R.id.table);
        TableRow row = new TableRow(this);
        TextView t1 = new TextView(this);
        TextView t2 = new TextView(this);
        TextView t3 = new TextView(this);

        for (int i = 0; i < data.size(); i++) {
            String ingredient_names = data.get(i);
            String quantities = data1.get(i);
            String expiration_dates = data2.get(i);

            t1.setText("");
            t2.setText("");
            t3.setText("");
        }

        row.addView(t1);
        row.addView(t2);
        row.addView(t3);
        table.addView(row);

        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
    }
}