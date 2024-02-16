package com.jgh.test.alone.oneDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PutTheChg_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

         int N = Integer.parseInt(st.nextToken());     // 바구니
         int M = Integer.parseInt(st.nextToken());      // 몇번 바꿀건지
         int arr[] = new int[N];
         int temp;

        for (int i = 0; i < N; i++) {      // [ 1,2,3,4,5 ]
            arr[i] = i+1;
        }

        for (int i = 0; i < M; i++) {

            st = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());

            temp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = temp;
        }

        for (int i:arr) {
            System.out.print(i+" ");
        }

    }
}
