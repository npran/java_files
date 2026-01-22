import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;

        // Try all possible pattern lengths
        for (int k = 1; k <= N / 2; k++) {
            if (N % k != 0) continue;

            boolean valid = true;

            for (int i = k; i < N; i++) {
                if (arr[i] != arr[i % k]) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                // Print smallest repeating pattern
                for (int i = 0; i < k; i++) {
                    System.out.print(arr[i] + " ");
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.print("-1");
        }

        sc.close();
    }
}

