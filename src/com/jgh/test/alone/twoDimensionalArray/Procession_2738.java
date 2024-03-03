package com.jgh.test.alone.twoDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Procession_2738 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr1[][] = new int[n][m];
        int arr2[][] = new int[n][m];


        /*
         * 1  1  1
         * 2  2  2
         * 0  1  0
         * */
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        /*
        * 3  3  3
        * 4  4  4
        * 5  5  100
        * */
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        /*
        * 4  4  4
        * 6  6  6
        * 5  6  100
        *
        * */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
                if(j == m-1){   // 열 2번 끝 , 개행 추가
                    System.out.println();
                }
            }
        }

    }
}
