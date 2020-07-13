package com.vominh.design.pattern.singleton;

public class CoffeeMachine {
    private static final CoffeeMachine INSTANCE = new CoffeeMachine();

    public static CoffeeMachine getInstance() {
        return INSTANCE;
    }

    public void makeCoffee() {
        System.out.println("Coffee go go go");
    }

    public static void main(String[] args) {
        CoffeeMachine machine1 = CoffeeMachine.getInstance();
        CoffeeMachine machine2 = CoffeeMachine.getInstance();
        System.out.println(machine1.hashCode());
        System.out.println(machine2.hashCode());
        machine1.makeCoffee();
    }
}
