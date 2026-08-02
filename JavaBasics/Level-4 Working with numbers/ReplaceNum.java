//Write a program to replace all zeros in a number n with the digit 5.

import java.util.*;

public class ReplaceNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        n = Math.abs(n);

        int original = n;
        int result = 0;
        int place = 1;

        while(n > 0){

            int digit = n % 10;

            if(digit == 0){
                digit = 5;
            }

            result = result + digit * place;

            place = place * 10;
            n = n / 10;
        }

        System.out.print("New Number: " + result);
    }
}

