package algorithms;

public class Fibonacci100 {
    public static void main(String[] args) {
        long a = 0, b = 1;

        System.out.println("First 100 Fibonacci numbers:");

        for (int i = 1; i <= 100; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
    }
}

