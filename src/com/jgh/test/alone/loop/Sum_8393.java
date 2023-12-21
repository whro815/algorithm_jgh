package com.jgh.test.alone.loop;

import java.util.Scanner;

public class Sum_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        sc.close();

        System.out.println(sum);

    }
}
