package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        String numberAsString = "2022.125";
        System.out.println("numberAsString = " + numberAsString);

        double number = Double.parseDouble(numberAsString); // to convert string into a number
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);


    }
}