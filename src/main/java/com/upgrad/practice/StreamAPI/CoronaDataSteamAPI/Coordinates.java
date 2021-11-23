package com.upgrad.practice.StreamAPI.CoronaDataSteamAPI;

public class Coordinates {

    String latitude;
    String longitude;

    public Coordinates(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }
}
