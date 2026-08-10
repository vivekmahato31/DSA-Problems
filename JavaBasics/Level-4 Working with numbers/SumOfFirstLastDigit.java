//Write a program to find the sum of the first and last digit of a number n.

import java.util.*;

public class SumOfFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number: ");
        int n = sc.nextInt();

        n = Math.abs(n);

        int LastDigit = n % 10;

        while (n >= 10){
            n = n/10;
        }
        int FirstDigit = n;

        int sum = FirstDigit + LastDigit;
        System.out.print("The Sum Of First and Last Digit is " + sum);

        sc.close();
    }
}
