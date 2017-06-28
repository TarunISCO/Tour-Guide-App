package com.example.android.delhitourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AtmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_list);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(getString(R.string.canara_bank), getString(R.string.atm1),R.drawable.atm_machine));
        dataWord.add(new DataWord(getString(R.string.canara_bank), getString(R.string.atm2),R.drawable.atm_machine));
        dataWord.add(new DataWord(getString(R.string.icici_bank), getString(R.string.atm3),R.drawable.atm_machine));
        dataWord.add(new DataWord(getString(R.string.icici_bank), getString(R.string.atm4),R.drawable.atm_machine));
        dataWord.add(new DataWord(getString(R.string.baroda_bank), getString(R.string.atm5),R.drawable.atm_machine));
        dataWord.add(new DataWord(getString(R.string.baroda_bank), getString(R.string.atm6),R.drawable.atm_machine));
        dataWord.add(new DataWord(getString(R.string.pnb), getString(R.string.atm7),R.drawable.atm_machine));
        dataWord.add(new DataWord(getString(R.string.pnb), getString(R.string.atm8),R.drawable.atm_machine));
        dataWord.add(new DataWord(getString(R.string.pnb), getString(R.string.atm9),R.drawable.atm_machine));

        DataAdapter adapter = new DataAdapter(this, dataWord, R.color.color_atm);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
