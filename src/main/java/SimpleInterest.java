/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Filipe Frances
 */
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double p = in.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double r = in.nextDouble();
        System.out.print("Enter the number of years: ");
        double t = in.nextDouble();
        double A = p*(1 +(r*t)/100);
        int y = (int)t;
        int si = (int)A;
        System.out.println("After "+y+" years at "+r+"%, the investment will be worth $"+si+".");
    }
}
