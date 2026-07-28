//Write a program to check whether a number n is a palindrome (reads the same reversed).
import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int original = n;

        while(n>0){

            int digit = n % 10;
            n = n/10;
            digit++;

            if(digit == original){
                System.out.println(n + " is a Palindrome Number");
            }
            else {
                System.out.println(n + " is a Not Palindrome Number");

            }
        }
        sc.close();
    }
}
