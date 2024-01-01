import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int numberOne = scanner.nextInt();

        System.out.println("Please enter the second number");
        int numberTwo =  scanner.nextInt();

        int GCD = Calculate(numberOne, numberTwo);

        System.out.println("The GCD of the given two numbers is: " + GCD);

    }

    private static int Calculate(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return Calculate(b, a%b);
        }
    }
}
