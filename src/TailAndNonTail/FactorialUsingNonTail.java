package TailAndNonTail;

public class FactorialUsingNonTail {
    public static int factorial(int number){
        if(number == 0){
            return 1;
        }
        return number * factorial(number-1);
    }

    public static void main(String[] args){
        System.out.println("The factorial of 5 is: "+factorial(5));
    }
}

/*
OUTPUT

The factorial of 5 is: 120
 */