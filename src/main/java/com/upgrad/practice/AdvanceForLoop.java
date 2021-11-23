package com.upgrad.practice;
import java.util.*;
public class AdvanceForLoop {

    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");

        for(String game : gamesList){
            System.out.println(game);
        }

        gamesList.forEach(System.out::println);
    }

}
