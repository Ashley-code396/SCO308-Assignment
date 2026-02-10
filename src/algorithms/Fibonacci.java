package algorithms;

import java.math.BigInteger;


public class Fibonacci {

    public static void main(String[] args) {
        int count = 100;

        generateFibonacci(count);
    }


    public static void generateFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }

        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            System.out.print(first);

            if (i < n) {
                System.out.print(", ");
            }

            BigInteger next = first.add(second);

            first = second;
            second = next;
        }

        System.out.println();
    }
}