import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of rows
        int n = sc.nextInt();

        long maxSum = Long.MIN_VALUE;
        int maxRow = 0;

        // Process each row
        for (int i = 0; i < n; i++) {

            // Read number of elements in this row
            int m = sc.nextInt();

            // Create array for the row
            int[] arr = new int[m];

            // Read elements
            for (int j = 0; j < m; j++) {
                arr[j] = sc.nextInt();
            }

            // Calculate weighted sum
            long currentSum = 0;
            for (int j = 0; j < m; j++) {
                currentSum += (long) arr[j] * (j + 1); // 1-based index
            }

            // Check for maximum
            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxRow = i;
            }
        }

        // Output
        System.out.println("MaxWeightedRow: " + maxRow);
        System.out.println("WeightedSum: " + maxSum);
    }
}
