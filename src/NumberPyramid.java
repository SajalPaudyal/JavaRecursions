public class NumberPyramid {
    public static void main(String[] args) {
        int numberOfLines = 5;
        printPyramid(numberOfLines);
    }
    private static void printLine(int lineNumber, int currentLine) {
        if (currentLine > lineNumber) {
           System.out.println();
        } else {
            System.out.print(currentLine + " ");
            printLine(lineNumber, currentLine + 1);
        }
    }
    private static void printPyramid(int n) {
        if (n > 0) {
            printLine(n, 1);
            printPyramid(n - 1);
        }
    }
}

/*
 OUTPUT

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
