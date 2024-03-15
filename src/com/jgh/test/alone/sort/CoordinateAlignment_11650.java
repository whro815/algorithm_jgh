package com.jgh.test.alone.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CoordinateAlignment_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for (int i = 0; i < n; i++) {
          st = new StringTokenizer(br.readLine());

          int f = Integer.parseInt(st.nextToken());
          int d = Integer.parseInt(st.nextToken());

          arr1[i] = f;
          arr2[i] = d;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < n; i++) {
            System.out.println(arr1[i]+" "+arr2[i]);
        }

    }
}
