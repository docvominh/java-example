package com.vominh.design.pattern.oop;

public class Generic {

    public static void main(String[] args) {

	ICommon<A> aCommon = new ACommon();
	ICommon<B> bCommon = new BCommon();

	System.out.println(aCommon.showInfo());
	System.out.println(bCommon.showInfo());
    }
}

interface ICommon<T> {
    String showInfo();
}

class ACommon implements ICommon<A> {

    public String showInfo() {
	return A.class.toString();
    }

}

class BCommon implements ICommon<B> {

    public String showInfo() {
	return B.class.toString();
    }

}

class A {
    public void showInfo() {
	System.out.println(this.getClass());
    }

}

class B {
    public void showInfo() {
	System.out.println(this.getClass());
    }

}