//Problem 3 - Largest Prime Factor

//New Method - Fast

import java.lang.Math;

public class Problem3 {
    //Theory: for a number n = p1 * p2 * p3...* p(n-1) where pi (from 1 to n-1) is prime (but not necessarily unique) for pi > 1
    //if we continuously divide n with it's smallest factor, then the number that we divided it by after which n becomes 1, is the largest prime factor

    static long smallestPrimeFactor(long number) {
        for (long i = 2L; i<=Math.sqrt(number); i++) {
            if (number%i == 0) {
                return i;
            }
        }
        return number; //if the number itself is the smallest prime factor
    }

    public static void main(String[] args) {
        final long NUMBER = 600851475143L;

        long num = NUMBER;
        long largestPrimeFactor = 0L;

        while (num!=1) {
            long factor = smallestPrimeFactor(num);
            num/=factor;
            largestPrimeFactor = factor;
        }
        
        System.out.printf("%d is the largest prime factor of %d", largestPrimeFactor, NUMBER);
    }
}





// Old Method - Very Slow

/*
public class Problem3 {
    static boolean isPrime(long number) {
        for (long i=2L; i<=number/2;i++) {
            if (number%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        final long NUMBER = 600851475143L;

        long largest=0;
        for (long factor = 2L; factor<NUMBER; factor++) {
            if (NUMBER%factor==0) {
                System.out.printf("%d is the current factor", factor);
                System.out.println();
                if (isPrime(factor) == true) {
                    System.out.printf("%d, is the current prime factor", factor);
                    System.out.println();
                    System.out.println();
                    if (largest<factor) {
                        largest=factor;
                    }
                }
            } 
        }

        System.out.printf("The largest prime factor of %d is %d", NUMBER, largest);
    }
}
*/