import java.util.Arrays;
import java.util.Random;

public class q1 {
    public static int[] generateHeights(int size, int minHeight, int maxHeight) {
        Random random = new Random();
        int[] heights = new int[size];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(maxHeight - minHeight + 1) + minHeight;
        }

        return heights;
    }

    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double meanHeight(int[] heights) {
        return (double) sumHeights(heights) / heights.length;
    }

    public static int shortestHeight(int[] heights) {
        int shortest = Integer.MAX_VALUE;
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public static int tallestHeight(int[] heights) {
        int tallest = Integer.MIN_VALUE;
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11, 150, 250);

        System.out.println("Player heights (cm): " + Arrays.toString(heights));
        System.out.println("Shortest player height: " + shortestHeight(heights) + " cm");
        System.out.println("Tallest player height: " + tallestHeight(heights) + " cm");
        System.out.printf("Mean player height: %.2f cm%n", meanHeight(heights));
    }
}