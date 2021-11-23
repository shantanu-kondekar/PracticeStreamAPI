package com.upgrad.practice.StreamAPI.CoronaDataSteamAPI;

import java.util.ArrayList;
import java.util.List;

public class CoronaData {

        String country;
        String updatedAt;
        List<DeathStatus> status;
        List<Coordinates> coordinates;

    public CoronaData(String country, String updatedAt, List<DeathStatus> status, List<Coordinates> coordinates) {
        this.country = country;
        this.updatedAt = updatedAt;
        this.status = status;
        this.coordinates = coordinates;
    }

    public String getCountry() {
        return country;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public List<DeathStatus> getStatus() {
        return status;
    }

    public List<Coordinates> getCoordinates() {
        return coordinates;
    }
}
