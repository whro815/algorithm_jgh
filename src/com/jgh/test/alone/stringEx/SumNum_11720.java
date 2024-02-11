package com.jgh.test.alone.stringEx;

import java.io.*;

public class SumNum_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int sum = 0;

        for(byte val : br.readLine().getBytes()){
            sum += (val - '0');
        }

        System.out.print(sum);
    }
}
