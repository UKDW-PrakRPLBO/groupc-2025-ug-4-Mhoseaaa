package org.example;

public class HDMI extends Colokan{

    public HDMI(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    @Override
    public Double getRealBandwidth() {
        double ratio = (double) getHarga() / 50000;
        if (ratio < 1) {
            return (Double) (ratio * getPromisedBandwidth());
        } else {
            return getPromisedBandwidth();
        }
    }
}
