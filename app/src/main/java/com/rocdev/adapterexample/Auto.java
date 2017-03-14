package com.rocdev.adapterexample;

/**
 * Created by piet on 13-03-17.
 */

public class Auto {
    String merk;
    double prijs;

    public Auto(String naam, double prijs) {
        this.merk = naam;
        this.prijs = prijs;
    }

    public String getMerk() {
        return merk;
    }

    public double getPrijs() {
        return prijs;
    }
}
