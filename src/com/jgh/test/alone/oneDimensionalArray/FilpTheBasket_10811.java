package com.jgh.test.alone.oneDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FilpTheBasket_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N =Integer.parseInt(st.nextToken());   // 5 바구니 총 N개
        int M =Integer.parseInt(st.nextToken());   // 4 M번 바구니의 순서를 역순으로

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int j = 0; j < M; j++) {

            st = new StringTokenizer(br.readLine()," ");

            int L = Integer.parseInt(st.nextToken()) - 1;
            int R = Integer.parseInt(st.nextToken()) - 1;

            while (L < R){
                int temp = arr[L];
                arr[L++] = arr[R];
                arr[R--] = temp;
            }

        }

        br.close();

        for (int basket: arr) {
            System.out.print(basket+" ");
        }

    }
}
