//Write a program to check whether a number n is a palindrome (reads the same reversed).
import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        n = Math.abs(n);

        int original = n;
        int reverse = 0;

        while(n>0){

            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n/10;
        }

        if (reverse == original) {
            System.out.println(original + " is a Palindrome Number");
        } else {
            System.out.println(original + " is Not a Palindrome Number");
        }

        sc.close();
    }
}
