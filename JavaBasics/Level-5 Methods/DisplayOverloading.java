//Create an overloaded method `display()` with one `int` parameter and one `String` parameter, and display the passed values.
import java.util.*;

public class DisplayOverloading {

    static void display(int num) {
        System.out.println("Number: " + num);
    }

    static void display(String text) {
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        display(num);
        display(text);
    }
}