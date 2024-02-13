package com.jgh.test.alone.stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class strRepetition_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int total = Integer.parseInt(br.readLine());
        for (int i = 0; i < total; i++) {

            st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            String p = st.nextToken();

            for (int j = 0; j < p.length(); j++) {
                for (int k = 0; k < num; k++) {
                    System.out.print(p.charAt(j));
                }
            }

            System.out.println();

        }

    }
}
