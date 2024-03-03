package com.jgh.test.alone.twoDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumValue_2566 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int arr[][] = new int[9][9];

        int maxVal = 0;     // 최댓값
        int rw = 1;         // 행
        int cl = 1;         // 열

        for (int i = 0; i < 9; i++) {     // 0 ~ 8
            st=new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) { // 0 ~ 8
                arr[i][j] = Integer.parseInt(st.nextToken());
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
