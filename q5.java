import java.util.Scanner;

class UnitConverterQ5 {
    public static double convertYardsToFeet(double yards) {
        return yards * 3.0;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }
}

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter yards: ");
        double yards = scanner.nextDouble();
        System.out.println(yards + " yards = " + UnitConverterQ5.convertYardsToFeet(yards) + " feet");

        System.out.print("Enter feet: ");
        double feet = scanner.nextDouble();
        System.out.println(feet + " feet = " + UnitConverterQ5.convertFeetToYards(feet) + " yards");

        System.out.print("Enter meters: ");
        double meters = scanner.nextDouble();
        System.out.println(meters + " meters = " + UnitConverterQ5.convertMetersToInches(meters) + " inches");

        System.out.print("Enter inches: ");
        double inches = scanner.nextDouble();
        System.out.println(inches + " inches = " + UnitConverterQ5.convertInchesToMeters(inches) + " meters");
        System.out.println(inches + " inches = " + UnitConverterQ5.convertInchesToCentimeters(inches) + " centimeters");

        scanner.close();
    }
}