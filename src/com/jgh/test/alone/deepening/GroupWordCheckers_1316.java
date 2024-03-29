package com.jgh.test.alone.deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupWordCheckers_1316 {

    static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    static boolean chkTrueFalse() throws IOException {

        String str = sc.readLine();

        boolean[] check = new boolean[26];

        int prev = 0;   // 이전 인덱스

        for (int j = 0; j < str.length(); j++) {

            int nowChar = str.charAt(j);

            if (prev != nowChar) {

                if (check[nowChar - 'a'] == false) {
                    check[nowChar - 'a'] = true;
                    prev = nowChar;
                } else { // 해당 문자가 이미 나온적이 있음
                    return false;
                }

            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(sc.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (chkTrueFalse() == true) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}
