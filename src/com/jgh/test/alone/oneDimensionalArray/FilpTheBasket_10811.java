package com.jgh.test.alone.oneDimensionalArray;

import java.util.Scanner;

public class FilpTheBasket_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 5 바구니 총 N개
        int M = sc.nextInt();   // 4 M번 바구니의 순서를 역순으로

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int j = 0; j < M; j++) {

            int L = sc.nextInt() -1;
            int R = sc.nextInt() -1;

            while (L < R){
                int temp = arr[L];
                arr[L++] = arr[R];
                arr[R--] = temp;
            }

        }

        sc.close();

        for (int basket: arr) {
            System.out.print(basket+" ");
        }

    }
}
