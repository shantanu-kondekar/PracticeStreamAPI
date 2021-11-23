package com.upgrad.practice.StreamAPI.CoronaDataSteamAPI;

import java.util.ArrayList;
import java.util.List;

public class SteamMapReduceFilterDemo {

    public static void main(String[] args) {

        List<CoronaData> coronaData = CoronaDatabase.getAllData();
        System.out.println("All Corona Data : ");
        /*coronaData.forEach(data -> {
            System.out.println(
                    data.getCountry() + "\n"
                    + data.getUpdatedAt() + "\n"
                    + data.getStatus() + "\n"
                    + data.getCoordinates());
        });*/
        System.out.println(coronaData);


    }
}
