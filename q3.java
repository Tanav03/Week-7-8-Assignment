import java.util.Arrays;
import java.util.Scanner;

class NumberCheckerQ3 {
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

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += (int) Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int target = Math.abs(number);
        if (target == 0) {
            return false;
        }
        int digitSum = sumOfDigits(digits);
        return digitSum != 0 && target % digitSum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < frequency.length; i++) {
            frequency[i][0] = i;
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digitCount = NumberCheckerQ3.countDigits(number);
        int[] digits = NumberCheckerQ3.storeDigits(number);
        int[][] frequency = NumberCheckerQ3.digitFrequency(digits);

        System.out.println("Number of digits: " + digitCount);
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + NumberCheckerQ3.sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + NumberCheckerQ3.sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad number: " + NumberCheckerQ3.isHarshadNumber(number, digits));

        System.out.println("Digit frequency table [digit, frequency]:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(Arrays.toString(frequency[i]));
            }
        }

        scanner.close();
    }
}