package org.example;

public class VGA extends Colokan{
    public VGA(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    @Override
    public Double getRealBandwidth() {
        double ratio = (double) getHarga() / 30000;
        if (ratio < 1) {
            return (Double) (ratio * getPromisedBandwidth());
        } else {
            return getPromisedBandwidth();
        }
    }
}
