package com.jgh.test.alone.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortingNum_2750 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuffer sb = new StringBuffer();

        int total = Integer.parseInt(br.readLine());
        int[] arr = new int[total];

        for (int i = 0; i < total; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //정렬 메소드
        Arrays.sort(arr);

        for (int i: arr) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);

    }
}
