package com.vominh.design.pattern.oop;

public class Interface {

    public static void main(String[] args) {
	IHuman human1 = new Asian();
	IHuman human2 = new UnitedState();

	System.out.println(human1.ShowInfo());
	System.out.println(human2.ShowInfo());
    }
}

interface IHuman {
    public String ShowInfo();
}

class Asian implements IHuman {

    public String ShowInfo() {
	return "I am asian !";
    }

}

class UnitedState implements IHuman {

    public String ShowInfo() {
	return "I am US !";
    }

}
