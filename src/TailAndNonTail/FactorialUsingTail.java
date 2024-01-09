package TailAndNonTail;

/*
A recursive call is made at the end of the function. There must not be any other actions to do when the recursive function is invoked
Advantage : Can be directly translated into loops and doesn't need extra stack space.
 */

public class FactorialUsingTail {

    public static int factorial(int number, int answer){
        if(number == 0){
            return answer;
        }
        return factorial(number -1, number * answer); // Recursive call
    }

    public static void main(String[] args){
        System.out.println(factorial(5,1));
    }
}
