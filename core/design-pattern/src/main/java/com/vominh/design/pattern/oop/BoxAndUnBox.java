package com.vominh.design.pattern.oop;

public class BoxAndUnBox {

	private static int intNomarl = 10;
	private static Integer intBox = 20;

	static Integer one = new Integer(1);
	static Integer anotherOne = new Integer(1);

	public static void main(String[] args) {
		System.out.println("Sum of two : " + (intNomarl + intBox));

		// java 8
		System.out.println("Java 8 compare (return an int value) : " + Integer.compare(10, 20));

		System.out.println("== compare: " + (one == anotherOne));
		System.out.println("== compare with convert value: " + (one.intValue() == anotherOne.intValue()));
		System.out.println("equals compare: " + one.equals(anotherOne));
	}

	// Important point about Autoboxing and Unboxing in Java
	// 1) Compiler uses valueOf() method to convert primitive to Object and uses
	// intValue(), doubleValue() etc to get primitive value from Object.
	// 2) During autoboxing boolean is converted to Boolean, byte to Byte, char
	// converted to Character, float changes to Float
	// , int goes to Integer, long goes to Long and short converts to Short,
	// while in unboxing opposite happens like Float to float.
}
