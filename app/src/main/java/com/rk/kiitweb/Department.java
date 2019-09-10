package com.rk.kiitweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Department extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);
    }
    public void cse(View v)
    {
        String s = "https://cse.kiit.ac.in/";
        Uri u = Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }
    public void capp(View v)
    {
        String s = "https://ksca.kiit.ac.in/";
        Uri u = Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }
    public void ele(View v)
    {
        String s = "http://electrical.kiit.ac.in/";
        Uri u = Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }
    public void tronics(View v)
    {
        String s = "https://electronics.kiit.ac.in/";
        Uri u = Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }
    public void me(View v)
    {
        String s = "https://mechanical.kiit.ac.in/";
        Uri u = Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }
    public void civil(View v)
    {
        String s = "https://civil.kiit.ac.in/";
        Uri u = Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }
    public void arc(View v)
    {
        String s = "https://ksap.kiit.ac.in/";
        Uri u = Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }
    public void che(View v)
    {
        String s = "https://chemical.kiit.ac.in/";
        Uri u = Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }
    public void bio(View v)
    {
        String s = "https://biotech.kiit.ac.in/";
        Uri u = Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }
    public void appsci(View v)
    {
        String s = "http://ksas.kiit.ac.in/";
        Uri u = Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }
    public void poly(View v)
    {
        String s = "https://kp.kiit.ac.in/";
        Uri u = Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }
    public void kiti(View v)
    {
        String s = "https://iti.kiit.ac.in/";
        Uri u = Uri.parse(s);
        Intent in = new Intent(Intent.ACTION_VIEW, u);
        startActivity(in);
    }


}
