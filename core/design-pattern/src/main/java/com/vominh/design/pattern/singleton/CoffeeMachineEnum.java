package com.vominh.design.pattern.singleton;

public enum CoffeeMachineEnum {
    INSTANCE;

    public void makeCoffee() {
        System.out.println("Coffee go go go");
    }

    public static void main(String[] args) {
        CoffeeMachineEnum machine1 = CoffeeMachineEnum.INSTANCE;
        CoffeeMachineEnum machine2 = CoffeeMachineEnum.INSTANCE;
        System.out.println(machine1.hashCode());
        System.out.println(machine2.hashCode());
        machine1.makeCoffee();
    }
}
