import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args){
        int numOfDiscs;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of discs you want in the problem");
        numOfDiscs = scanner.nextInt();
        moveDisc(numOfDiscs, 'A', 'C', 'B');
    }
    public static void moveDisc(int number, char start, char end, char temp){
        if(number==1){
            System.out.println("Move disc 1 from "+ start +" to " + end);
            return;
        }

        moveDisc(number-1, start, temp, end);
        System.out.println("Move disc "+ number +" from "+ start +" to "+ end);
        moveDisc(number-1, temp, end, start);
    }
}

/*
 OUTPUT
 Please enter the number of discs you want in the problem
3
Move disc 1 from A to C
Move disc 2 from A to B
Move disc 1 from C to B
Move disc 3 from A to C
Move disc 1 from B to A
Move disc 2 from B to C
Move disc 1 from A to C
 */