package com.jgh.test.alone.twoDimensionalArray;

import java.util.Scanner;

public class MaximumValue_2566 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[9][9];

        int maxVal = 0;     // 최댓값
        int rw = 1;         // 행
        int cl = 1;         // 열

        for (int i = 0; i < 9; i++) {     // 0 ~ 8
            for (int j = 0; j < 9; j++) { // 0 ~ 8
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (maxVal < arr[i][j]) {
                    maxVal = arr[i][j];
                    rw = i + 1;
                    cl = j + 1;
                }
            }
        }

        System.out.println(maxVal);
        System.out.println(rw+" "+cl);
    }
}
