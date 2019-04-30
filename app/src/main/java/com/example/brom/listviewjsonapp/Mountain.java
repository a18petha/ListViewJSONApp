package com.example.brom.listviewjsonapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.brom.listviewjsonapp.R;

public class Mountain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mountains);
        Intent intent = getIntent();

        TextView test = (TextView) findViewById(R.id.world);
        TextView test1 = (TextView) findViewById(R.id.world1);
        TextView test2 = (TextView) findViewById(R.id.world2);
        String mountainNames = intent.getStringExtra("mountainNames");
        String mountainLocations = intent.getStringExtra("mountainLocations");
        int Heights = intent.getIntExtra("Heights", 0);
        test2.setText("Names of the mountain: " +mountainNames);
        test1.setText("Height "+Heights);
        test.setText("Location: " + mountainLocations);
    }
}
