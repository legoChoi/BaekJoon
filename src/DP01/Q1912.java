package DP01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Q1912 {
    public static int[] dp;
    public static int[] list;

    public static void run() {

        dp[0] = list[0];

        for (int i = 1; i < list.length; i++) {
            dp[i] = Math.max(list[i], dp[i - 1] + list[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int N = Integer.parseInt(s);

        dp = new int[N];

        s = br.readLine();
        list = Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        run();
        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}
