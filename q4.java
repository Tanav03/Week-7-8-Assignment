import java.util.Scanner;

class UnitConverterQ4 {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }
}

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter kilometers: ");
        double km = scanner.nextDouble();
        System.out.println(km + " km = " + UnitConverterQ4.convertKmToMiles(km) + " miles");

        System.out.print("Enter miles: ");
        double miles = scanner.nextDouble();
        System.out.println(miles + " miles = " + UnitConverterQ4.convertMilesToKm(miles) + " km");

        System.out.print("Enter meters: ");
        double meters = scanner.nextDouble();
        System.out.println(meters + " meters = " + UnitConverterQ4.convertMetersToFeet(meters) + " feet");

        System.out.print("Enter feet: ");
        double feet = scanner.nextDouble();
        System.out.println(feet + " feet = " + UnitConverterQ4.convertFeetToMeters(feet) + " meters");

        scanner.close();
    }
}