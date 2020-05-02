package com.ing.demo.demo.controller;

public class Testcontroller {

    public String getDetails() {

        return "Hari";
    }


    public static void main(String[] args) {

        Testcontroller testcontroller=new Testcontroller();
       String ss= testcontroller.getDetails();
        System.out.println("details are "+ss);

    }
}
