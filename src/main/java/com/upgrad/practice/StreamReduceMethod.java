package com.upgrad.practice;

import java.util.Arrays;
import java.util.List;

public class StreamReduceMethod {
    public static void main(String[] args) {
        List<Integer> demoList = Arrays.asList(1,2,3,4,5,6);

        int result = demoList.stream().reduce(0, (subtotal, elements) -> subtotal + elements);
    }
}
