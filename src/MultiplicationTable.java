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

/*
 OUTPUT
Please enter the number for multiplication table:
3
The table of 3 up to 10 is
3 X 1= 3
3 X 2= 6
3 X 3= 9
3 X 4= 12
3 X 5= 15
3 X 6= 18
3 X 7= 21
3 X 8= 24
3 X 9= 27
3 X 10= 30
 */