import java.util.Scanner;

public class q2 {
    private static long calculateHandshakes(long numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        long numberOfStudents = scanner.nextLong();

        long handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("The maximum number of handshakes is: " + handshakes);

        scanner.close();
    }
}