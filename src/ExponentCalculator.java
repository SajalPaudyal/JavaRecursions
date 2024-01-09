import java.util.Scanner;

public class ExponentCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the base number: ");
        int baseNumber = scanner.nextInt();

        System.out.println("Please enter the exponent number: ");
        int exponent = scanner.nextInt();

        int exponentAnswer = exponentPower(baseNumber, exponent);

        System.out.println("The exponential answer is: " + exponentAnswer);
    }

    public static int exponentPower(int x, int y){
        if(y ==0){
            return 1;
        }
        return x * exponentPower(x, y-1);
    }
}

/*
OUTPUT

Please enter the base number:
5
Please enter the exponent number:
2
The exponential answer is: 25
 */
