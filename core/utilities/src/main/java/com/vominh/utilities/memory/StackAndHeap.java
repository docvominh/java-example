package com.vominh.utilities.memory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StackAndHeap {
    public static void main(String[] args) {
        int begin = 5;
        changeValue(begin);

        String beginString = "what";
        changeValue(beginString);

        BigDecimal bigDecimal = new BigDecimal(5);
        changeValue(bigDecimal);

        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        changeValue(names);

        System.out.println(begin);
        System.out.println(beginString);
        System.out.println(bigDecimal);
        System.out.println(names);
    }


    private static void changeValue(int value) {
        value = value * 2;
    }

    private static void changeValue(String value) {
        value = value + "5";
    }

    private static void changeValue(BigDecimal value) {
        value = value.add(new BigDecimal(5));
    }

    private static void changeValue(List<String> values) {
        values.add("C");
    }
}
