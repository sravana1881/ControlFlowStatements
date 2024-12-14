package LoopsPracticeAssignment;

import java.util.Scanner;

public class GreatestCommonDevisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first positive number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second positive number: ");
        int n2 = input.nextInt();
        if (n1 <= 0 || n2 <= 0) {
            System.out.println("Invalid input.Please enter positive number");
        } else {
            int gcd = gcd(n1, n2);
            System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd(n1, n2));
        }
        input.close();
    }
    public static int gcd(int n1, int n2) {
        int gcd = 1; // Default value if no other common divisor found)

        // Find the minimum of n1 and n2
        int min = (n1 < n2) ? n1 : n2;

        // Loop through all numbers from 1 to min to check divisibility
        for (int k = 1; k <= min; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k; // Update gcd to the current divisor
            }
        }

        return gcd;
    }
}
