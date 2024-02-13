package com.jgh.test.alone.stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class alphabat_10809 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[26];   // 알파벳 개수

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;    // 알파벳 전체 -1 세팅
        }

        String S = br.readLine().toLowerCase();

        for (int i = 0; i < S.length(); i++) {

            // 초기화
            char ch = S.charAt(i);

            // arr 원소 값이 -1인 경우에만 초기화
            if(arr[ch-'a'] == -1) {
                arr[ch-'a'] = i;
            }

        }

        for (int value: arr) {
            System.out.print(value + " ");
        }

    }

}
