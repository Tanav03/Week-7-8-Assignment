import java.util.Scanner;

public class q3 {
    private static double calculateRounds(double side1, double side2, double side3, double distanceMeters) {
        double perimeter = side1 + side2 + side3;
        return Math.ceil(distanceMeters / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1 in meters: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 in meters: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 in meters: ");
        double side3 = scanner.nextDouble();

        double distanceMeters = 5000.0;
        double rounds = calculateRounds(side1, side2, side3, distanceMeters);

        System.out.println("The athlete needs to complete " + (long) rounds + " rounds to complete 5 km.");

        scanner.close();
    }
}