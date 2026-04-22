import java.util.Arrays;
import java.util.Scanner;

class NumberCheckerQ2 {
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

    public static boolean isDuckNumber(int[] digits) {
        // The prompt defines duck as having a non-zero digit.
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int digit : digits) {
            sum += (int) Math.pow(digit, power);
        }

        return sum == Math.abs(number);
    }

    public static int[] largestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest) {
                secondLargest = digit;
            }
        }
        return new int[] { largest, secondLargest };
    }

    public static int[] smallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest) {
                secondSmallest = digit;
            }
        }
        return new int[] { smallest, secondSmallest };
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digitCount = NumberCheckerQ2.countDigits(number);
        int[] digits = NumberCheckerQ2.storeDigits(number);
        int[] largestPair = NumberCheckerQ2.largestAndSecondLargest(digits);
        int[] smallestPair = NumberCheckerQ2.smallestAndSecondSmallest(digits);

        System.out.println("Number of digits: " + digitCount);
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Is duck number: " + NumberCheckerQ2.isDuckNumber(digits));
        System.out.println("Is armstrong number: " + NumberCheckerQ2.isArmstrongNumber(number, digits));
        System.out.println("Largest digit: " + largestPair[0]);
        System.out.println("Second largest digit: " + largestPair[1]);
        System.out.println("Smallest digit: " + smallestPair[0]);
        System.out.println("Second smallest digit: " + smallestPair[1]);

        scanner.close();
    }
}