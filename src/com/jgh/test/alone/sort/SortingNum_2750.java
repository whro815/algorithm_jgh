package com.jgh.test.alone.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SortingNum_2750 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        int total = sc.nextInt();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());
        int[] arr = new int[total];

        for (int i = 0; i < total; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < total-1; i++) {
            for (int j = i+1; j < total ; j++) {
                if(arr[i] > arr[j]){
                    int sub = arr[j];
                    arr[j] = arr[i];
                    arr[i] = sub;
                }
            }
        }

        for (int i: arr) {
            System.out.println(i);
        }
    }
}
