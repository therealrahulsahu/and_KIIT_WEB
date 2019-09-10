package com.rk.kiitweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b1 = findViewById(R.id.bt_courses);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Home.this, Courses.class);
                startActivity(in);
            }
        });
        b2 = findViewById(R.id.bt_department);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Home.this, Department.class);
                startActivity(in);
            }
        });
        b3 = findViewById(R.id.bt_faculty);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "http://kiit.ac.in/academics/faculty/";
                Uri u = Uri.parse(s);
                Intent in = new Intent(Intent.ACTION_VIEW, u);
                startActivity(in);
            }
        });
        b4 = findViewById(R.id.bt_extra);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "http://kiit.ac.in/campuslife/";
                Uri u = Uri.parse(s);
                Intent in = new Intent(Intent.ACTION_VIEW, u);
                startActivity(in);
            }
        });
        b5 = findViewById(R.id.bt_sports);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "http://kiit.ac.in/campuslife/sports/";
                Uri u = Uri.parse(s);
                Intent in = new Intent(Intent.ACTION_VIEW, u);
                startActivity(in);
            }
        });
        b6 = findViewById(R.id.bt_fees);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "http://kiit.ac.in/mba-rm/fee-structure/";
                Uri u = Uri.parse(s);
                Intent in = new Intent(Intent.ACTION_VIEW, u);
                startActivity(in);
            }
        });
        b7 = findViewById(R.id.bt_gallery);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "http://kiit.ac.in/tour/";
                Uri u = Uri.parse(s);
                Intent in = new Intent(Intent.ACTION_VIEW, u);
                startActivity(in);
            }
        });
        b8 = findViewById(R.id.bt_kiitoff);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "http://kiit.ac.in/";
                Uri u = Uri.parse(s);
                Intent in = new Intent(Intent.ACTION_VIEW, u);
                startActivity(in);
            }
        });
    }
}
