package com.example.android.delhitourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intent code for Hotels
        LinearLayout hotelsLinearLayout = (LinearLayout) findViewById(R.id.hotels);
        hotelsLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotelsIntent = new Intent(MainActivity.this, StayRoomActivity.class);
                startActivity(hotelsIntent);
            }
        });

        //Intent code for Atm
        LinearLayout atmLinearLayout = (LinearLayout) findViewById(R.id.atm);
        atmLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent atmIntent = new Intent(MainActivity.this, AtmActivity.class);
                startActivity(atmIntent);
            }
        });

        //Intent code for Hospitals
        LinearLayout hospitalsLinearLayout = (LinearLayout) findViewById(R.id.hospitals);
        hospitalsLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hospitalsIntent = new Intent(MainActivity.this, HospitalsActivity.class);
                startActivity(hospitalsIntent);
            }
        });

        //Intent code for Metro Stations
        LinearLayout metroLinearLayout = (LinearLayout) findViewById(R.id.metro);
        metroLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent metroIntent = new Intent(MainActivity.this, MetroActivity.class);
                startActivity(metroIntent);
            }
        });
    }
}
