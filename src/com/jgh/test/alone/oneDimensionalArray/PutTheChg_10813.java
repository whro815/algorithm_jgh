package com.jgh.test.alone.oneDimensionalArray;

import java.util.Scanner;

public class PutTheChg_10813 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int N = sc.nextInt();      // 바구니
         int M = sc.nextInt();      // 몇번 바꿀건지
         int arr[] = new int[N];
         int temp;

        for (int i = 0; i < N; i++) {      // [ 1,2,3,4,5 ]
            arr[i] = i+1;
        }

        for (int i = 0; i < M; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();

            temp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = temp;
        }

        for (int i:arr) {
            System.out.print(i+" ");
        }

    }
}
