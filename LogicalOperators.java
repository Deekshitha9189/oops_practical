package oop;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number (x): ");
        int x = input.nextInt();

        System.out.print("Enter second number (y): ");
        int y = input.nextInt();

        System.out.print("Enter third number (z): ");
        int z = input.nextInt();

        System.out.println("\n--- Logical Operators ---");

        // && operator (AND)
        System.out.println("(x > y) && (z > y) → " + ((x > y) && (z > y)));
        System.out.println("(x > y) && (z < y) → " + ((x > y) && (z < y)));

        // || operator (OR)
        System.out.println("(x < y) || (z > y) → " + ((x < y) || (z > y)));
        System.out.println("(x > y) || (z < y) → " + ((x > y) || (z < y)));
        System.out.println("(x < y) || (z < y) → " + ((x < y) || (z < y)));

        // ! operator (NOT)
        System.out.println("!(x == y) → " + (!(x == y)));
        System.out.println("!(x > y) → " + (!(x > y)));

        input.close();
    }
}
