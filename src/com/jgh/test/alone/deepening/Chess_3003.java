package com.jgh.test.alone.deepening;

import java.util.Scanner;

public class Chess_3003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 1, 2, 2 ,2, 8};

        int[] iArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            iArr[i] = sc.nextInt();
            arr[i] = arr[i] - iArr[i];
        }

        for (int i: arr) {
            System.out.print(i + " ");
        }

    }
}
