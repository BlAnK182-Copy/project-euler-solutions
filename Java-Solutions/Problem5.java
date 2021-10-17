//Problem 5 - Smallest Multiple

public class Problem5 {
    protected static long gcd(long num1, long num2) {
        long gcd = 0;
        if (num1==0 || num2==0) {
            gcd = 0;
        }
        else {
            if (num1>num2) {
                for (long i=1; i<=num2;i++) {
                    if (num2%i==0 && num1%i==0 && gcd<i) {
                        gcd = i;
                    }
                }
            }
            else {
                for (long i=1; i<=num1;i++) {
                    if (num2%i==0 && num1%i==0 && gcd<i) {
                        gcd = i;
                    }
                }
            }
        }

        return gcd;
    }

    protected static long lcm(long num1, long num2) {
        // System.out.printf("num1: %d, num2: %d, gcd: %d, result: %d", num1, num2, gcd(num1,num2), ((num1*num2)/gcd(num1,num2)));
        // System.out.println();
        return ((num1 * num2) / (gcd(num1,num2)));
    }

    public static void main(String[] args) {
        long smallestMultiple = 1;
        for (long i = 1; i<=20; i++) {
            smallestMultiple = lcm(i, smallestMultiple);
            // System.out.printf("the current smallestMultiple (i = %d) is:%d", i, smallestMultiple);
            // System.out.println();
            // System.out.println();
        }

        System.out.println("Smallest Multiple that is evenly divisible by all numbers from 1 to 20 is: " + smallestMultiple);
    }

}
