//Problem 7 - 10001st Prime

public class Problem7 {
    public static boolean isPrime(int number) {
        for (int i=2; i<number/2+1; i++) {
            if (number%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int incrementor = 1;
        int count = 0;

        while (count<10001) {
            incrementor++;
            if (isPrime(incrementor)) {
                count++;
            }
            // System.out.printf("%dth: %d", count, incrementor);
            // System.out.println();
            // System.out.println();
        }

        System.out.printf("the %dth prime is: %d", count, incrementor);
        System.out.println();
    }
}
