//  Write a program to reverse a number n.

import java.util.*;
public class ReverseNum {
     public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int digit = 0;
        n = Math.abs(n);

        if ( n == 0 ){
            System.out.println("0");
        }
        else{
            System.out.println("The digits of a number are : ");
            while ( n > 0){
                digit = n % 10;
                System.out.println(digit);
                n = n/10;
            } 
        }  
        sc.close();
    }
}
