import java.util.Scanner;

public class q1 {
    private static int[] findFactors(int number) {
        int target = Math.abs(number);
        int count = 0;

        for (int i = 1; i <= target; i++) {
            if (target % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= target; i++) {
            if (target % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    private static int sumOfFactors(int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum;
    }

    private static long productOfFactors(int[] factors) {
        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }

    private static double sumOfSquares(int[] factors) {
        double sum = 0;

        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Factors are not defined for zero.");
            scanner.close();
            return;
        }

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(factors[i]);
        }
        System.out.println();

        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));

        scanner.close();
    }
}