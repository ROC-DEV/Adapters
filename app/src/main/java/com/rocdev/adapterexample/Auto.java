package com.rocdev.adapterexample;

/**
 * Created by piet on 13-03-17.
 * model Klasse om data (merk en prijs) van een auto object op te slaan
 *
 */

public class Auto {
    private String merk;
    private double prijs;

    public Auto(String merk, double prijs) {
        this.merk = merk;
        this.prijs = prijs;
    }

    /**
     *
     * @return geeft merk van auto object
     */
    public String getMerk() {
        return merk;
    }

    /**
     *
     * @return geeft prijs van auto object
     */
    public double getPrijs() {
        return prijs;
    }
}
