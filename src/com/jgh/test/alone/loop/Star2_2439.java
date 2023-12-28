package com.jgh.test.alone.loop;

import java.util.Scanner;

public class Star2_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {       // 0 ~ 5
            for (int j = a; j < a - i; j--) {   //  j = 4 3 2 1 0    >  a-1 = 4 3 2 1
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
