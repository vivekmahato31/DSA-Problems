//Create a method isEven(int number) that returns true if the given number is even, otherwise returns false.

import java.util.*;
public class isEvenOdd {

    static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number: ");
        int a = sc.nextInt();

        boolean result = isEven(10);
        System.out.print(result);
    }
}
