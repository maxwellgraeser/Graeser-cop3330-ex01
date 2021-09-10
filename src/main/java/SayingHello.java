/*
 *  UCF COP3330 Fall 2021 Exercise 1 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
public class SayingHello {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        name = input.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
