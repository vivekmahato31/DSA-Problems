//Create a method isEven(int number) that returns true if the given number is even, otherwise returns false.

public class isEvenOdd {

    static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean result = isEven(10);
        System.out.print(result);
    }
}
