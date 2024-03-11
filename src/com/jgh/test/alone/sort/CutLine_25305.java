package com.jgh.test.alone.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CutLine_25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Integer arr[] = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 내림차순
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.print(arr[k-1]);
    }
}
