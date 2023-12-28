package com.jgh.test.alone.oneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax_10818 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int arr[] = new int[total];
        int n = 0;

        for (int i = 0; i < total; i++) {
            n = sc.nextInt();
            arr[i] = n;
        }

        sc.close();
        Arrays.sort(arr);   // 오름차순으로 정렬 -> 예) 20 10 35 30 7 -> 7 10 20 30 35
        System.out.print(arr[0] + " " +arr[total-1]);   // 최솟값 , 최댓값
    }
}
