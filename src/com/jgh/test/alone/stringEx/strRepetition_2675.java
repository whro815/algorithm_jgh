package com.jgh.test.alone.stringEx;

import java.util.Scanner;

public class strRepetition_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        for (int i = 0; i < total; i++) {

            int num = sc.nextInt();
            String p = sc.next();

            for (int j = 0; j < p.length(); j++) {
                for (int k = 0; k < num; k++) {
                    System.out.print(p.charAt(j));
                }
            }

            System.out.println();

        }

    }
}
