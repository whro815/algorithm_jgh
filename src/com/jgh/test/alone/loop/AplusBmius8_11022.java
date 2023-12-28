package com.jgh.test.alone.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AplusBmius8_11022 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer;

        int T = Integer.parseInt(reader.readLine());

        for(int i = 0; i < T; i++){
            stringTokenizer = new StringTokenizer(reader.readLine());
            writer.write("Case #"+i+": "+Integer.parseInt(stringTokenizer.nextToken())+" + "+Integer.parseInt(stringTokenizer.nextToken())+" = "+(Integer.parseInt(stringTokenizer.nextToken())+Integer.parseInt(stringTokenizer.nextToken()))+"\n");
        }

    }
}
