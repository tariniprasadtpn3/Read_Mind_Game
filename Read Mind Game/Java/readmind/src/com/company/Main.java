package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// write your code here
        System.out.println("--------Instructions--------");
        System.out.println("Think a number between 1 to 1 Lakh ");
        System.out.println("--------------------------------");
        System.out.println("Multiply that number by 2");
        System.out.println("Then Add 4 to your number");
        System.out.println("Then Multiply that number by 5");
        System.out.println("Then Add 12 to your number");
        System.out.println("Then multiply that number to 10");
        System.out.println("Subtract 320 from that number");
        System.out.println("--------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter that number: ");
        int num = sc.nextInt();
        int res = num / 100;
        System.out.println("Number You Think is: " + res);
    }
}
