// Write a program to find the sum of all digits of a number n.

import java.util.*;

public class SumOfDigits {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n =sc.nextInt();
        int original = n;
        n = Math.abs(n);
        int sum = 0 ;

        if ( n == 0){
            System.out.print("The sum of all digits of a number "+ original + " is: ");
            System.out.println("0");
        }
        else {
                System.out.print("The sum of all digits of a number "+ original + " is: ");
            while ( n > 0){
                int digit = n % 10;
                n = n/10;
                sum = sum + digit;
            }
            System.out.println(sum);
        }
        sc.close();
    }   
}
