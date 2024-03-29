package com.jgh.test.alone.sort;

import java.io.*;
import java.util.Arrays;

public class SortingNum2_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i: arr) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
