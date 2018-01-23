package com.example.asha.thehelloapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clk(View view) {

        EditText et = (EditText) findViewById(R.id.et);
        Toast.makeText(getApplicationContext(), "Hello " + et.getText().toString() + "!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
