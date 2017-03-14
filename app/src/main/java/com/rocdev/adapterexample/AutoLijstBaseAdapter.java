package com.rocdev.adapterexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by piet on 13-03-17.
 */

public class AutoLijstBaseAdapter extends BaseAdapter {


    ArrayList<Auto> autoLijst;
    LayoutInflater inflater;

    public AutoLijstBaseAdapter(Context context, ArrayList<Auto> autoLijst) {
        this.autoLijst = autoLijst;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return autoLijst.size();
    }

    @Override
    public Object getItem(int i) {
        return autoLijst.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.list_item, null);
        }
        TextView merkTextView = (TextView) view.findViewById(R.id.merk);
        TextView prijsTextView = (TextView) view.findViewById(R.id.prijs);
        Auto auto = autoLijst.get(i);
        merkTextView.setText(auto.getMerk());
        prijsTextView.setText(String.valueOf(auto.getPrijs()));
        return view;
    }
}
