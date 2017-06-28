package com.example.android.delhitourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(getString(R.string.masalaHouse_name), getString(R.string.masalaHouse_address), R.drawable.restaurant_food));
        dataWord.add(new DataWord(getString(R.string.lakhori_name), getString(R.string.lakhori_address), R.drawable.restaurant_dish));
        dataWord.add(new DataWord(getString(R.string.getafix_name), getString(R.string.getafix_address), R.drawable.restaurant_food));
        dataWord.add(new DataWord(getString(R.string.chinaGarden_name), getString(R.string.chinaGarden_address), R.drawable.restaurant_dish));
        dataWord.add(new DataWord(getString(R.string.tamasha_name), getString(R.string.tamasha_address), R.drawable.restaurant_dish));
        dataWord.add(new DataWord(getString(R.string.hoc_name), getString(R.string.hoc_address), R.drawable.restaurant_food));
        dataWord.add(new DataWord(getString(R.string.motomahal_name), getString(R.string.motimahal_address), R.drawable.restaurant_dish));
        dataWord.add(new DataWord(getString(R.string.lodi_name), getString(R.string.lodi_address), R.drawable.restaurant_food));

        DataAdapter adapter = new DataAdapter(getActivity(), dataWord, R.color.color_restaurant);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
