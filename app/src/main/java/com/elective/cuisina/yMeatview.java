package com.elective.cuisina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class yMeatview extends AppCompatActivity {

    ListView lst1;
    ArrayList<String> titles = new ArrayList<String>();
    ArrayAdapter arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yactivity_ymeatview);

        SQLiteDatabase db = openOrCreateDatabase("SliteDb",Context.MODE_PRIVATE,null);

        lst1 = findViewById(R.id.lst1);
        final Cursor c = db.rawQuery("select * from records2",null);
        int id = c.getColumnIndex("id");
        int name = c.getColumnIndex("name");
        int course = c.getColumnIndex("course");
        int fee = c.getColumnIndex("fee");
        titles.clear();


        arrayAdapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,titles);
        lst1.setAdapter(arrayAdapter);

        final  ArrayList<zStudents> stud = new ArrayList<zStudents>();


        if(c.moveToFirst())
        {
            do{

                zStudents stu = new zStudents();
                stu.id = c.getString(id);
                stu.name = c.getString(name);
                stu.course = c.getString(course);
                stu.fee = c.getString(fee);

                stud.add(stu);


                titles.add(c.getString(id) + " \t " + c.getString(name) + " \t "  + c.getString(course) + " \t "  + c.getString(fee) );




            } while(c.moveToNext());
            arrayAdapter.notifyDataSetChanged();
            lst1.invalidateViews();



        }

        lst1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String aa = titles.get(position).toString();

                zStudents stu = stud.get(position);
                Intent i = new Intent(getApplicationContext(),yMeatedit.class);

                i.putExtra("id",stu.id);
                i.putExtra("name",stu.name);
                i.putExtra("course",stu.course);
                i.putExtra("fee",stu.fee);
                startActivity(i);




            }
        });






    }
}