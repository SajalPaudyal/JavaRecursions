import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number for multiplication table: ");
        int number = scanner.nextInt();

        System.out.println("The table of " +number + " up to 10 is");
        multiplication(number, 1);
    }

    public static void multiplication(int number, int multiplier){


        if(multiplier<=10){
            System.out.println(number + " X " + multiplier +"= " + (number * multiplier));
            multiplication(number, multiplier +1);

        }
    }
}