import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of numbers you want in the Fibonacci series: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci series up to "+ n +" terms are: ");

        for(int i=0 ; i<n; i++){
            System.out.println(calculateFibonacci(i) + " ");
        }

    }
    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
}
