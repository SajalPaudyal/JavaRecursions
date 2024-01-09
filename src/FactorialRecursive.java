import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] main){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of which you want the factorial of: ");
        int number = scanner.nextInt();

        if(number<0){
            System.out.println("Please enter non negative integer");
        }
        else{
            double factorial = calculateFactorial(number);
            System.out.println("The factorial of the given number is: "+ factorial);
        }
        scanner.close();
    }
    public static double calculateFactorial(int a){
        if(a == 0 || a == 1){
            return 1;
        }
        else {
            return a * calculateFactorial(a-1);
        }
    }
}

/*
OUTPUT

Please enter the number of which you want the factorial of:
6
The factorial of the given number is: 720.0
 */