//Write a program to read a number and check whether it is prime or not.

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       if( n % 1 == 0 && n % n == 0){
           System.out.println(n + " is a Prime Number");
       }
       else {
           System.out.println(n + " is not a Prime Number");
       }
       sc.close();
    }
}
