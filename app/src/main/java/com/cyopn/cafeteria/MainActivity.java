package com.cyopn.cafeteria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Connection;

public class MainActivity extends AppCompatActivity {
    Connect c = new Connect();
    Connection cn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cn = c.getConnect();
        setContentView(R.layout.activity_main);
    }

    public void onClicContine(View v) {
        Intent i = new Intent(this, BuyActivity.class);
        startActivity(i);
    }

    public void onClicSearch(View v) {
        EditText et_ma = findViewById(R.id.etxt_matricula);

    }

}