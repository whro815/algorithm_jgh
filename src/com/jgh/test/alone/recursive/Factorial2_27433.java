package com.jgh.test.alone.recursive;

import java.util.Scanner;

public class Factorial2_27433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long res;

        if(n == 0){
            res = 1;   // (같은) answer = 1;
        } else { res = factorial(n); }

        System.out.print(res);
        sc.close();
    }

    static long factorial(long n) {
        if(n > 1) { n = n * factorial(n-1); }
        else {              // n 이 1일 경우
            n = n * 1;      // n = 1 * 1;
        }
        return n;
    }

}
