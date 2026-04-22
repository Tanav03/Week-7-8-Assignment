import java.util.Arrays;
import java.util.Scanner;

class NumberCheckerQ4 {
    public static int countDigits(int number) {
        int value = Math.abs(number);
        if (value == 0) {
            return 1;
        }

        int count = 0;
        while (value > 0) {
            count++;
            value /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int value = Math.abs(number);
        int[] digits = new int[countDigits(value)];

        if (value == 0) {
            digits[0] = 0;
            return digits;
        }

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = value % 10;
            value /= 10;
        }
        return digits;
    }

    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] first, int[] second) {
        if (first.length != second.length) {
            return false;
        }

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        // The prompt defines duck as having a non-zero digit.
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
}

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digitCount = NumberCheckerQ4.countDigits(number);
        int[] digits = NumberCheckerQ4.storeDigits(number);
        int[] reversedDigits = NumberCheckerQ4.reverseDigitsArray(digits);

        System.out.println("Number of digits: " + digitCount);
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Reversed digits array: " + Arrays.toString(reversedDigits));
        System.out.println("Arrays are equal: " + NumberCheckerQ4.areArraysEqual(digits, reversedDigits));
        System.out.println("Is palindrome number: " + NumberCheckerQ4.isPalindrome(digits));
        System.out.println("Is duck number: " + NumberCheckerQ4.isDuckNumber(digits));

        scanner.close();
    }
}