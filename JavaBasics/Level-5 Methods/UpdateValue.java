//Write a method `updateValue(int x)` that changes the value of `x` and verify that the original variable in `main()` does not change.**

import java.util.*;

public class UpdateValue {

    static void updateValue(int x) {
        x = 100;
        System.out.println("Inside method: " + x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int x = sc.nextInt();

        System.out.println("Before method: " + x);

        updateValue(x);

        System.out.println("After method: " + x);
    }
}