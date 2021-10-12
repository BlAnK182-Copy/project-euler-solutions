//Problem 2 - Even Fibonacci Numbers

import java.util.ArrayList;

public class Problem2 {

    static boolean isEven(int number) {
        if (number%2==0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> fib = new ArrayList<Integer>();
        fib.add(0);
        fib.add(1); // current value of fib = [0,1]

        final int FIXED_VALUE = 4000000; 
        
        int incrementor = fib.size();
        Integer curValue=0;
        while (curValue<FIXED_VALUE) {
            curValue = fib.get(incrementor-1) + fib.get(incrementor-2); 
            // in a fibonacci series, each subsequent term is the sum of the previous two
            fib.add(curValue);
            incrementor+=1;
        }

        // System.out.println(fib); //printing for debugging

        int fibSum = 0;
        for (int term : fib) {
            if (isEven(term)==true) {
                fibSum+=term;
            }
        }

        System.out.printf("the sum is: %d",fibSum);
        System.out.println();

    }    
}