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
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(getString(R.string.hotel_kabana_name), getString(R.string.hotel_kabana_address), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hotel_bbplace_name), getString(R.string.hotel_bbplace_address), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hotel_parknew_name), getString(R.string.hotel_parknew_address), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hotel_kk_name), getString(R.string.hotel_kk_address), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hotel_royalplaza_name), getString(R.string.hotel_royalplaza_address), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hotel_radisson_name), getString(R.string.hotel_radisson_address), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hotel_hari_name), getString(R.string.hotel_hari_address), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hotel_aman_name), getString(R.string.hotel_aman_address), R.drawable.hotel));

        DataAdapter adapter = new DataAdapter(getActivity(), dataWord, R.color.color_hotel);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
