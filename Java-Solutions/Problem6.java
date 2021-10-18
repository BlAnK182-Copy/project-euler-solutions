//Problem 6 - sum square difference

import java.lang.Math;

public class Problem6 {
    public static int sumOfSquares(int n) {
        int sumOfSquaresVar = 0;

        for (int i=1; i<=n;i++) {
            sumOfSquaresVar+=Math.pow(i,2);
        }

        return sumOfSquaresVar;
    }

    public static double squareOfSums(int n) {
        int squareOfSumsVar = 0;

        for (int i=1; i<=n;i++) {
            squareOfSumsVar+=i;
        }

        double squareOfSumsVarDouble = squareOfSumsVar;

        return Math.pow(squareOfSumsVarDouble, 2.0);
    }

    public static void main(String[] args) {
        System.out.printf("%.1f", squareOfSums(100) - sumOfSquares(100));
    }
}
