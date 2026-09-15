//Create a method calculatePercentage(int obtained, int total) that calculates and returns the percentage.
import java.util.*;

public class CalculatePercentage {
    static float CalculatePercentage(int obtained, int total){
        float percentage = (float)obtained / total * 100;
        return percentage;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Obtained Number: ");
        int obtained = sc.nextInt();

        System.out.print("Enter The Total Number: ");
        int total = sc.nextInt();

        float result = CalculatePercentage(obtained, total);
        System.out.print(result);

    sc.close();
    }
}
