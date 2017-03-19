package com.rocdev.adapterexample;

/**
 * Created by piet on 19-03-17.
 */

public class Auto {

    private String merk;
    private double prijs;


    public Auto(String merk, double prijs) {
        this.merk = merk;
        this.prijs = prijs;
    }


    public String getMerk() {
        return merk;
    }

    public double getPrijs() {
        return prijs;
    }


    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }
}
