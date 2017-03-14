package com.rocdev.adapterexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Auto> autos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.autolist);
        vulAutoLijst();

        // Maak een BaseAdapter of een ArrayAdapter
//        AutoLijstBaseAdapter adapter = new AutoLijstBaseAdapter(this, autos);
        AutoLijstArrayAdapter adapter = new AutoLijstArrayAdapter(this, autos);

        // Koppel adapter aan ListView
        listView.setAdapter(adapter);

    }

    // hulpmethode om lijst met een aantal auto's te vullen
    private void vulAutoLijst() {
        autos = new ArrayList<>();
        autos.add(new Auto("Fiat", 5590.95));
        autos.add(new Auto("Daihatsu", 4750.00));
        autos.add(new Auto("BMW", 8995.00));
        autos.add(new Auto("Honda", 2500.95));

    }
}
