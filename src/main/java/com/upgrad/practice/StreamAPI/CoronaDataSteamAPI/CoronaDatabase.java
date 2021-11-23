package com.upgrad.practice.StreamAPI.CoronaDataSteamAPI;
// https://stackoverflow.com/questions/53610571/how-to-print-set-list-in-object-with-lambda

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoronaDatabase {
    public static List<CoronaData> getAllData(){

        List<CoronaData> coronaDataList = new ArrayList<>();
        coronaDataList.addAll(
                Arrays.asList(new CoronaData("India", "2021-11-22",
                                List.of(new DeathStatus(156896, 5675, 0)),
                                List.of(new Coordinates("33.93911", "67.709953"))),

                new CoronaData("Pakistan", "2021-11-22",
                        List.of(new DeathStatus(640206, 9436, 0)),
                        List.of(new Coordinates("50.4496", "5.8492"))),

                new CoronaData("Sri Lanka", "2021-11-22",
                        List.of(new DeathStatus(182216, 9546, 0)),
                        List.of(new Coordinates("51.0536", "3.1458")))

        ));
        return coronaDataList;

    }

}
