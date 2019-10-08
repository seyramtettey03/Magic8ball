package com.lickingheights;

import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        //declare
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        Double number;

        //initailizing phase
        System.out.println("magic 8 ball");
        System.out.println("Pick any number between 1-100");
        number = keyboard.nextDouble();

        if (10 <= number && number < 0) {
            System.out.println(" most certain");
        }
         else if (20 > number && number > 10) {
            System.out.println("outlook looks good");
        }
         else if (30 > number && number > 20) {
            System.out.println("your the man");
        }
        if (40 > number && number > 30) {
            System.out.println("your the man");
        }
        if (50 > number && number > 40) {
            System.out.println("that sounds great");
        }
        if (60 > number && number > 50) {
            System.out.println("try again");
        }
        if (70 > number && number > 60){
            System.out.println("unlikely");
        }
        if (80 > number && number > 70){
            System.out.println("not positive");
        }
        if (90)































        }

        }

