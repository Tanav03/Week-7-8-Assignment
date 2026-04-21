import java.util.Scanner;

public class q2 {
    private static long recursiveSum(long number) {
        if (number == 1) {
            return 1;
        }

        return number + recursiveSum(number - 1);
    }

    private static long formulaSum(long number) {
        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        long number = scanner.nextLong();

        if (number <= 0) {
            System.out.println("Input is not a natural number.");
            scanner.close();
            return;
        }

        long recursiveResult = recursiveSum(number);
        long formulaResult = formulaSum(number);

        System.out.println("Sum using recursion: " + recursiveResult);
        System.out.println("Sum using formula: " + formulaResult);
        System.out.println("Both results are equal: " + (recursiveResult == formulaResult));

        scanner.close();
    }
}