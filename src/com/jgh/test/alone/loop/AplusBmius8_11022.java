package com.jgh.test.alone.loop;

import java.io.*;
import java.util.StringTokenizer;

public class AplusBmius8_11022 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int T = Integer.parseInt(bf.readLine());
        int a = 0;
        int b = 0;

        for(int i = 0; i < T; i++){
            st = new StringTokenizer(bf.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write("Case #"+ (i+1) +": " + a + " + " + b +" = "+ (a+b)+"\n");
        }

        bw.close();

    }
}
