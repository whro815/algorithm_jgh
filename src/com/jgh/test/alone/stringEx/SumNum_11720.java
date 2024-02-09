package com.jgh.test.alone.stringEx;

import java.util.Scanner;

public class SumNum_11720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String a = in.next();
        in.close();

        int sum = 0;

        for(int i = 0; i < N; i++) {
            sum += a.charAt(i)-'0';
        }
        System.out.print(sum);
    }
}
