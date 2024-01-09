public class NestedRecursion {
    /*
    What is nested recursion?
    Nested recursion is a recursive function that invokes itself within it's body but with a different set of parameter.
     */
     public static int sumOfArray(int[] array, int n){
         if(n==0){
             return array[n];
         }
         return array[n] + sumOfArray(array, n-1);
     }

     public static void main(String[] args){
         int [] inputArray = {2,4,6,8,10,12};
         int totalSum = sumOfArray(inputArray, inputArray.length-1);
         System.out.println("The sum of the numbers in array is: "+ totalSum);
     }
}

/*
OUTPUT

The sum of the numbers in array is: 42
 */