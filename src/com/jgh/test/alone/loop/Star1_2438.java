package com.jgh.test.alone.loop;

import java.util.Scanner;

public class Star1_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
