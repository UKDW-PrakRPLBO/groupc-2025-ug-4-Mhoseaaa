package org.example;

public abstract class Colokan {
    private int harga;
    private double promisedBandwidth;
    private String merk;

    public Colokan() {
    }
// Colokan(int harga, double promisedBandwidth, String merk)
    public Colokan(int harga, double promisedBandwidth, String merk) {
        this.harga = harga;
        this.promisedBandwidth = promisedBandwidth;
        this.merk = merk;
    }
// Getter and setter
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getPromisedBandwidth() {
        return promisedBandwidth;
    }

    public void setPromisedBandwidth(double promisedBandwidth) {
        this.promisedBandwidth = promisedBandwidth;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
//    getRealBandwidth : double (abstratic)
    public abstract Double getRealBandwidth();
}
