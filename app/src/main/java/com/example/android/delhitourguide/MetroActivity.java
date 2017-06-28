package com.example.android.delhitourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MetroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_list);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(getString(R.string.metro1_name), getString(R.string.metro1_address), R.drawable.metro));
        dataWord.add(new DataWord(getString(R.string.metro2_name), getString(R.string.metro2_address), R.drawable.metro));
        dataWord.add(new DataWord(getString(R.string.metro3_name), getString(R.string.metro3_address), R.drawable.metro));
        dataWord.add(new DataWord(getString(R.string.metro4_name), getString(R.string.metro4_address), R.drawable.metro));
        dataWord.add(new DataWord(getString(R.string.metro5_name), getString(R.string.metro5_address), R.drawable.metro));
        dataWord.add(new DataWord(getString(R.string.metro6_name), getString(R.string.metro6_address), R.drawable.metro));
        dataWord.add(new DataWord(getString(R.string.metro7_name), getString(R.string.metro7_address), R.drawable.metro));
        dataWord.add(new DataWord(getString(R.string.metro8_name), getString(R.string.metro8_address), R.drawable.metro));
        dataWord.add(new DataWord(getString(R.string.metro9_name), getString(R.string.metro9_address), R.drawable.metro));

        DataAdapter adapter = new DataAdapter(this, dataWord, R.color.color_metro);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
