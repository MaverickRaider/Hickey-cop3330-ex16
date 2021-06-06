
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Hickey
 */

package oop.example;
import java.util.Scanner;

public class Ex16 {
    public static int legalAge = 16;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age? ");
        int age = scanner.nextInt();

        if(age <= 0){
            System.out.println("Invalid age");
            System.exit(0);
        }

        String statement = (age >= legalAge) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.println(statement);
    }
}