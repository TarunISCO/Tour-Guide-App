package com.example.android.delhitourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends ArrayAdapter<DataWord> {

    /**
     * mColorResourceId is used to store the color of the list item.
     */
    private int mColorResourceId;

    /**
     * Constructor used to initialise the Data object.
     *
     * @param context
     * @param dataWord
     * @param colorResourceId
     */
    public DataAdapter(Activity context, ArrayList<DataWord> dataWord, int colorResourceId) {
        super(context, 0, dataWord);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listViewItem = convertView;

        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        DataWord currentData = getItem(position);

        View textContainer = listViewItem.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        TextView nameTextView = (TextView) listViewItem.findViewById(R.id.name);
        nameTextView.setText(currentData.getName());

        TextView locationTextView = (TextView) listViewItem.findViewById(R.id.location);
        locationTextView.setText(currentData.getLocation());

        ImageView imageView = (ImageView) listViewItem.findViewById(R.id.image);
        if (currentData.hasImage()) {
            imageView.setImageResource(currentData.getImageResourceId());
        } else {
            imageView.setVisibility(View.GONE);
        }
        return listViewItem;
    }
}
