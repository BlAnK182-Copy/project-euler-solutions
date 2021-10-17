// Problem 4 - Largest Palindrome Product

public class Problem4 {

    static boolean palindromeCheck(int number) {
        String rawString = Integer.toString(number);
        String revString = "";

        for (int i=rawString.length()-1; i>=0; i--) {
            revString+=rawString.charAt(i);
        }

        // System.out.println("Og string: " + rawString);
        // System.out.println("Rev string: " + revString);
        // System.out.println();

        if (rawString.equalsIgnoreCase(revString)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int largestPalindrome = 0;

        for (int i=100;i<1000;i++) {
            for (int j=100; j<1000; j++) {
                if (palindromeCheck(i*j)==true && largestPalindrome<i*j) {
                    largestPalindrome = i*j;
                    // System.out.printf("Current largest: %d", largestPalindrome);
                    // System.out.println();
                }
            }
        }

        System.out.printf("The largest palindrome product is: %d", largestPalindrome);
        System.out.println();


    }

}