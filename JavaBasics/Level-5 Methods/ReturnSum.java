// Create a method add(int a, int b) that returns the sum.

public class ReturnSum {
    static int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args){
        int result = add(5, 10);
        System.out.print(result);

    }
}