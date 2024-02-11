package com.jgh.test.alone.stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class final_2908 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int fst = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int sec = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.println(fst > sec ? fst : sec);
    }
}
