import java.util.Scanner;

public class GCD_Euclid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        while (n != 0) {
            int remainder = m % n;
            m = n;
            n = remainder;
        }

        System.out.println("GCD = " + m);
        sc.close();
    }
}
