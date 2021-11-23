package com.upgrad.practice.StreamAPI.CoronaDataSteamAPI;

public class DeathStatus {

    int confirmed;
    int deaths;
    int recovered;

    public DeathStatus(int confirmed, int deaths, int recovered) {
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.recovered = recovered;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getRecovered() {
        return recovered;
    }
}
