import java.util.Scanner;

public class MultiplicationUsingRecursion{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first integer: ");
        int firstInteger = scanner.nextInt();

        System.out.println("please enter the second integer: ");
        int secondInteger = scanner.nextInt();

        int product = multiply(firstInteger, secondInteger);

        System.out.println("The product of given two numbers is: " + multiply(firstInteger, secondInteger));
    }

    public static int multiply(int a, int b){
        if(a == 0 || b == 0){
            return 0;
        }
        return b + multiply(a-1, b);
    }
}