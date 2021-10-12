// Problem 1 - Multiples of 3 or 5

public class Problem1 {
    public static void main(String[] args) {
        final int NUMBER = 1000;

        long sum = 0;
        
        for (int i = 2; i<NUMBER; i++) {
            if (i%3==0 || i%5==0) {
                sum+=i;
            }
        }

        System.out.println("The sum is: " + sum);
    }
}