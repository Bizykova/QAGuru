package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner a = new Scanner(System.in);
        System.out.println("\n Enter the number");
        int num = a.nextInt();
        System.out.println("\n You have entered a number " + num);
    }
}