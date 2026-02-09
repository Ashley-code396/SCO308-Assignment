package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(arr));

        for (int pass = 1; pass < n; pass++) {
            System.out.println("\nPass " + pass + ":");
            for (int i = 0; i < n - pass; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    System.out.println(" Swapped " + arr[i + 1] + " and " + arr[i]
                            + " → " + Arrays.toString(arr));
                }
            }
        }

        System.out.println("\nSorted Array: " + Arrays.toString(arr));
        sc.close();
    }
}
