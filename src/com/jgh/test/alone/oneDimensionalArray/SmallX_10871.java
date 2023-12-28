package com.jgh.test.alone.oneDimensionalArray;

import java.util.Scanner;

public class SmallX_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();   // 수열 총 개수
        int x = sc.nextInt();       // 비교 숫자

        int arr[] = new int[total];

        int a = 0;

        for (int i = 0; i < total; i++) {
            a = sc.nextInt();
            arr[i] = a; // 수열 a
        }

        for (int i: arr) {
            if(i < x){  //
                System.out.print(i+" ");
            }
        }
    }
}
