import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        int n = arr.length;

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
    }
}

