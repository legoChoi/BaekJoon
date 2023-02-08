package DP01;

import java.util.Scanner;

public class Q24416 {
    public static int[] dp = new int[41];
    public static int cnt01 = 0;
    public static int cnt02 = 0;
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            cnt01++;
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void fibonacci(int n) {
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i < n + 1; i++) {
            cnt02++;
            dp[i] = dp[i - 1] + dp [i - 2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        fib(N);
        fibonacci(N);

        System.out.println(cnt01 + " " + cnt02);
    }
}
