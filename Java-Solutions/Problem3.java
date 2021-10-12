// slow method

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
