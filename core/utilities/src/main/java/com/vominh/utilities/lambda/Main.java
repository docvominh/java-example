package com.vominh.utilities.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

	numbers.forEach(x -> printValue(x));

	System.out.println(sum(numbers, x -> x > 4));

    }

    static void printValue(int number) {
	System.out.println(number);
    }

    static int sum(List<Integer> numbers, Predicate<Integer> p) {
	int total = 0;
	for (int number : numbers) {

	    if (p.test(number)) {
		total += number;
	    }
	}
	return total;
    }
}
