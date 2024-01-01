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
