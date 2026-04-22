import java.util.Scanner;

class NumberCheckerQ5 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeon(int number) {
        if (number < 0) {
            return false;
        }

        int square = number * number;
        int sum = 0;

        if (square == 0) {
            sum = 0;
        }

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    public static boolean isSpy(int number) {
        int value = Math.abs(number);

        if (value == 0) {
            return false;
        }

        int sum = 0;
        int product = 1;

        while (value > 0) {
            int digit = value % 10;
            sum += digit;
            product *= digit;
            value /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int number) {
        if (number < 0) {
            return false;
        }

        long square = (long) number * number;
        int temp = number;
        int divisor = 1;

        if (temp == 0) {
            return true;
        }

        while (temp > 0) {
            divisor *= 10;
            temp /= 10;
        }

        return square % divisor == number;
    }

    public static boolean isBuzz(int number) {
        return number % 7 == 0 || Math.abs(number) % 10 == 7;
    }
}

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Is prime number: " + NumberCheckerQ5.isPrime(number));
        System.out.println("Is neon number: " + NumberCheckerQ5.isNeon(number));
        System.out.println("Is spy number: " + NumberCheckerQ5.isSpy(number));
        System.out.println("Is automorphic number: " + NumberCheckerQ5.isAutomorphic(number));
        System.out.println("Is buzz number: " + NumberCheckerQ5.isBuzz(number));

        scanner.close();
    }
}