package com.jgh.test.alone.recursive;

import java.util.Scanner;

public class Factorial2_27433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 입력
        long res = 1;         // 결과

        for (int i = 1; i <= n; i++) {
            if(n == 0){
                res = 1;
            } else {
                res *= i;
            }
        }

        System.out.println(res);

    }

}
