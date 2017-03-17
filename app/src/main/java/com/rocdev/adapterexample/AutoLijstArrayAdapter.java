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

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;


/**
 * Created by piet on 13-03-17.
 * demo ArrayAdapter
 */

public class AutoLijstArrayAdapter extends ArrayAdapter<Auto> {

    private LayoutInflater inflater;

    /**
     * Geeft contect en data door aan superklasse
     * @param context de Activity
     * @param autoList de data
     */
    public AutoLijstArrayAdapter(Context context, List<Auto> autoList) {
        super(context, 0, autoList);
        inflater = LayoutInflater.from(context);
    }

    /**
     *
     * @param position de betreffende auto uit lijst
     * @param convertView evr view die gerecycled kan worden
     * @param parent niet gebruikt
     * @return view met data
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Auto auto = getItem(position);
        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.list_item, null);
        }
        TextView merkTextView = (TextView) view.findViewById(R.id.merk);
        TextView prijsTextView = (TextView) view.findViewById(R.id.prijs);
        merkTextView.setText(auto.getMerk());

        // set scheidingstekens voor DecimalFormat
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');

        // formatteer prijs string met scheidingstekens
        DecimalFormat df = new DecimalFormat("€ #,##0.00", symbols);
        prijsTextView.setText(df.format(auto.getPrijs()));
        return view;
    }
}
