//Sum of Even-Indexed and Odd-Indexed Elements

import java.util.*;

public class IndexSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int evenIndexSum = 0;
        int oddIndexSum = 0;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                evenIndexSum += arr[i];
            } else {
                oddIndexSum += arr[i];
            }
        }

        System.out.println("Even index sum = " + evenIndexSum);
        System.out.print("Odd index sum = " + oddIndexSum);
    }
}