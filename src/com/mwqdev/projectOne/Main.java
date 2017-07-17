package com.mwqdev.projectOne;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstString;
        String secondString;

        Double operand1;
        Double operand2;

        System.out.println("Please guess your first number");
        firstString = scanner.nextLine();
        operand1 = Double.parseDouble(firstString);
        System.out.println("Guess your second number");
        secondString = scanner.nextLine();
        operand2 = Double.parseDouble(secondString);

        Double sum = operand1 + operand2;
        Double difference = operand1 - operand2;
        Double division = operand1 / operand2;
        Double multiplication = operand1 * operand2;
        Double remainder = operand1 % operand2;

        System.out.println(function(sum, difference, division, multiplication, remainder));
    }
    private static String function(double sum, double difference, double division, double multiplication, double remainder) {
        return("The sum is " + sum + ". The difference is " + difference + ". The quotient is " + division + ". The Product is " + multiplication + ". Remainder is " + remainder + ".");
    }
}
