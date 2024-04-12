package com.prithviraj.carsapp;

import android.media.Image;

public class CarModel {

    private String carName;
    private int image;

    public CarModel(String carName, int image) {
        this.carName = carName;
        this.image = image;
    }

    public String getCarName() {
        return carName;
    }

    public int getImage() {
        return image;
    }
}
