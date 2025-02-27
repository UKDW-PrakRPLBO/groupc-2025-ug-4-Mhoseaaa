package org.example;

public class TV {
    private Colokan colokan;
    private int maxResolution;

//    TV(maxResolusi:int)
    public TV(int maxResolution) {
        this.maxResolution = maxResolution;
    }
//    connect(Colokan:colokan)
    public void connect(Colokan colokan) {
        this.colokan = colokan;
        System.out.println("Berhasil Connect ke - " + colokan.getMerk());
    }
    //  Getresolution(int)
    public String getResolution() {
        if (colokan == null) {
            return "TV tidak terhubung ke colokan";
        }

        Double bandwidth = colokan.getRealBandwidth();
        String resolution;

        if (bandwidth < 10) {
            return "TV tidak menyala";
        } else if (bandwidth <= 35) {
            resolution = "480";
        } else if (bandwidth <= 100) {
            resolution = "720";
        } else {
            resolution = "1080";
        }

        if (resolution.equals("1080")) {
            if (maxResolution < 1080) {
                resolution = maxResolution == 720 ? "720p" : "480p";
            }
        }
        return resolution;
    }
}