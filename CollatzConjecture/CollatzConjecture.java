// File: CollatzConjecture.java
// Problem Statement:
// Write a program that starts with an input number n.
// For even numbers, divide by 2 (n/2)
// For odd numbers, apply 3n + 1
// Continue the process until the result is 1.

import java.util.Scanner;

public class CollatzConjecture {

    // Method to calculate the Collatz steps and print the sequence
    public static int collatzSteps(int n) {
        int steps = 0;
        // Continue until the number reduces to 1
        while (n != 1) {
            System.out.print(n + ", ");
            if (n % 2 == 0) {
                // If n is even, divide by 2
                n /= 2;
            } else {
                // If n is odd, apply 3n + 1
                n = 3 * n + 1;
            }
            steps++;
        }
        System.out.println(1); // Print the last number 1
        return steps;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the first number
        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();

        // Taking input for the second number
        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();

        // Calculating and printing steps for the first number
        System.out.print("Steps for " + n1 + ": ");
        int steps1 = collatzSteps(n1);
        System.out.println("Total steps: " + steps1);

        // Calculating and printing steps for the second number
        System.out.print("Steps for " + n2 + ": ");
        int steps2 = collatzSteps(n2);
        System.out.println("Total steps: " + steps2);

        // Comparing the steps to determine which number reaches 1 in fewer steps
        if (steps1 < steps2) {
            System.out.println(n1 + " reaches 1 in fewer steps.");
        } else {
            System.out.println(n2 + " reaches 1 in fewer steps.");
        }

        scanner.close();
    }
}

/*
Sample Output 1:
Enter the first number: 8
Steps for 8: 8, 4, 2, 1
Total steps: 3
Enter the second number: 9
Steps for 9: 9, 28, 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1
Total steps: 19
8 reaches 1 in fewer steps.

Sample Output 2:
Enter the first number: 12
Steps for 12: 12, 6, 3, 10, 5, 16, 8, 4, 2, 1
Total steps: 9
Enter the second number: 15
Steps for 15: 15, 46, 23, 70, 35, 106, 53, 160, 80, 40, 20, 10, 5, 16, 8, 4, 2, 1
Total steps: 17
12 reaches 1 in fewer steps.
*/
