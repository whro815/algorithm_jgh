package com.jgh.test.alone.deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class star_2444 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = -n + 1; i < n; i++) {
            int absI = Math.abs(i);
            for (int j = 0; j < absI; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - absI) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
