package com.ing.demo.demo.controller;

public class Testcontroller {
    public Testcontroller() {
    }

    private String name;
    private int id;

    public Testcontroller(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getCount() {

        return 90;

    }


    public static void main(String[] args) {
        Testcontroller testcontroller = new Testcontroller();
        int aa = testcontroller.getCount();
        System.out.println("count------------" + aa);

    }
}
