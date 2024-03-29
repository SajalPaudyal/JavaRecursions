import java.util.Scanner;

public class PrimeNumberCheck {
    public static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the number: ");
        int number  = scanner.nextInt();

        if(isPrime(number,2)) {
            System.out.println(number + " is a prime number");
        }
        else{
            System.out.println(number +" is not a prime number");
        }

    }

    public static boolean isPrime(int num, int divisor){

        if(num <= 1){
            return false;
        }
        if(divisor> Math.sqrt(num)){
            return true;
        }
        if(num%divisor ==0){
            return false;
        }

        return isPrime(num, divisor+1);
    }
}

/*
OUTPUT (Case: Non Prime)
Please provide the number:
46
46 is not a prime number

OUTPUT (Case: Prime)
Please provide the number:
7
7 is a prime number
 */