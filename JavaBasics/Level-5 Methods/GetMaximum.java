// Create a method getMaximum(int a, int b) that returns the larger number.

import java.util.Scanner;

public class GetMaximum {

    static int getMaximum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        int result = getMaximum(a, b);

        System.out.println("Larger number is: " + result);
    }
}