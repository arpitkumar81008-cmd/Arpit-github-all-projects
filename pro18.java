import java.util.*;

class pro18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();

        int totalComb = 1 << n;  // 2^n
        int count = 0;

        System.out.println("OUTPUT:");
        for (int mask = 0; mask < totalComb; mask++) {
            int sum = 0;
            int[] combo = new int[n];

            for (int j = 0; j < n; j++) {
                int sign = ((mask >> j) & 1) == 0 ? -1 : 1;
                combo[j] = sign * (j + 1);
                sum += combo[j];
            }

            if (sum == 0) {
                count++;
                for (int val : combo) {
                    System.out.print(val + "\t");
                }
                System.out.println();
            }
        }

        System.out.println("Total number of combinations = " + count);

        sc.close();
    }
}
