package com.codekul.Java14OctSpring.ioc;

public class Vodafone implements Sim {

    @Override
    public void calling() {
        System.out.println("Vadafone calling");
    }

    @Override
    public void data() {
        System.out.println("Vadafone Data");

    }
}
