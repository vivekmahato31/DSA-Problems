//Write a program to count the number of even digits and odd digits in a number n.
import java.util.*;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        n = Math.abs(n);
        int Even = 0;
        int Odd = 0;

        if (n == 0){
            Even++;
            System.out.print("Even numbers: " + Even + " Odd numbers: " + Odd);
        }
        else {
            while(n > 0){

                int digit = n % 10;

                if (digit % 2 == 0){
                    Even++;
                }
                else {
                    Odd++;
                }

                n = n/10;
            }

            System.out.print("Even numbers: " + Even + " Odd numbers: " + Odd);
        }
        sc.close();
    }
}
