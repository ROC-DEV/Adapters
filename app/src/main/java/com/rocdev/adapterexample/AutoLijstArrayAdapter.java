package com.rocdev.adapterexample;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


/**
 * Created by piet on 13-03-17.
 *
 */

public class AutoLijstArrayAdapter extends ArrayAdapter<Auto> {


    public AutoLijstArrayAdapter(Context context, List<Auto> autoList) {
        super(context, 0, autoList);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Auto auto = getItem(position);
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, null);
        }
        TextView merkTextView = (TextView) view.findViewById(R.id.merk);
        TextView prijsTextView = (TextView) view.findViewById(R.id.prijs);
        merkTextView.setText(auto.getMerk());
        prijsTextView.setText(String.valueOf(auto.getPrijs()));
        return view;
    }
}
