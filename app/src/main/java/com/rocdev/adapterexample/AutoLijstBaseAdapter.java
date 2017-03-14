package com.rocdev.adapterexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;

/**
 * Created by piet on 13-03-17.
 * Simpele Uitwerking van een BaseAdapter klasse
 */

public class AutoLijstBaseAdapter extends BaseAdapter {


    private ArrayList<Auto> autoLijst;
    private LayoutInflater inflater;

    // Constructor
    public AutoLijstBaseAdapter(Context context, ArrayList<Auto> autoLijst) {
        this.autoLijst = autoLijst;
        inflater = LayoutInflater.from(context);
    }

    /**
     *
     * @return  het aantal items in de lijst
     */
    @Override
    public int getCount() {
        return autoLijst.size();
    }

    /**
     * geeft de auto in de lijst
     * @param i indexpositie van item
     * @return het auto object
     */
    @Override
    public Object getItem(int i) {
        return autoLijst.get(i);
    }

    /**
     * geeft eventueel id
     * @param i indexpositie
     * @return 0 deze methode wordt niet gebruikt
     */
    @Override
    public long getItemId(int i) {
        return 0;
    }

    /**
     * maakt view mbv data
     * @param position index betreffende auto
     * @param convertView eventueel recycle view
     * @param viewGroup niet gebruikt
     * @return de list item view
     */
    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.list_item, null);
        }
        TextView merkTextView = (TextView) view.findViewById(R.id.merk);
        TextView prijsTextView = (TextView) view.findViewById(R.id.prijs);
        Auto auto = autoLijst.get(position);
        merkTextView.setText(auto.getMerk());

        // set scheidingstekens voor DecimalFormat
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');

        // formatteer prijs string met scheidingstekens
        DecimalFormat decimalFormat = new DecimalFormat("€ #,##0.00", symbols);
        prijsTextView.setText(decimalFormat.format(auto.getPrijs()));
        return view;
    }
}
