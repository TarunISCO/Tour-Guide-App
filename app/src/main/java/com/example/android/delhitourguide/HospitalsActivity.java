package com.example.android.delhitourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HospitalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_list);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(getString(R.string.hospital1_name), getString(R.string.hospital1_address), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospital2_name), getString(R.string.hospital2_address), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospital3_name), getString(R.string.hospital3_address), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospital4_name), getString(R.string.hospital4_address), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospital5_name), getString(R.string.hospital5_address), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospital6_name), getString(R.string.hospital6_address), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospital7_name), getString(R.string.hospital7_address), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospital8_name), getString(R.string.hospital8_address), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospital9_name), getString(R.string.hospital9_address), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospital10_name), getString(R.string.hospital10_address), R.drawable.hospital));

        DataAdapter adapter = new DataAdapter(this, dataWord, R.color.color_hospitals);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
