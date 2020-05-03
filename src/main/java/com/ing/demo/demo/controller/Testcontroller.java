package com.ing.demo.demo.controller;

public class Testcontroller {
    public Testcontroller() {
    }

    private String name;
    private int id;

    private String country;
    private double amount;

    public String getDetails() {

        return "Hari";
    }



    public static class Test{

        private int id;
        private String name;

    public void get(){

        System.out.println("test");
    }

    }

    public static void main(String[] args) {
        Testcontroller testcontroller = new Testcontroller();


        Testcontroller testcontroller1=new Testcontroller();
       String ss= testcontroller1.getDetails();
        System.out.println("details are "+ss);

    }
}
