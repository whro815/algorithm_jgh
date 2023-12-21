package com.jgh.test.alone.loop;

import java.util.Scanner;

public class ASumB_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int arr[] = new int[num];

        for(int i= 0; i < num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a + b;
        }

        for(int i : arr) {
            System.out.println(i);
        }
    }
}
