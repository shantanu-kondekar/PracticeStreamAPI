package com.upgrad.practice.StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObjectDemo {

    public static void main(String[] args) {
        List<String> cities = List.of("Pune", "Parbhani", "Nanded", "Panvel");
        //Since we need cities starting with letter P, this situation comes under True or False case. So we are using Stream.filter
        List<String> result = cities.stream().filter(city -> city.startsWith("P")).collect(Collectors.toList());
        System.out.println(result);

        //Map
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);

        List<Integer> result1 = numbers.stream().map(num -> num + num).collect(Collectors.toList());
        System.out.println(result1);

        int totalNumbers = numbers.stream().reduce(0, (a,b) -> a+b);
        System.out.println("Addition : " + totalNumbers);

    }
}
