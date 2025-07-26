package oop;

import java.util.Scanner;

public class AssignmentOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for a: ");
        int a = input.nextInt();

        int var;

        // Using =
        var = a;
        System.out.println("var using = : " + var);

        // Using +=
        var += a;
        System.out.println("var using += : " + var);

        // Using *=
        var *= a;
        System.out.println("var using *= : " + var);

        input.close();
    }
}
