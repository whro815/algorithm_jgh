package com.jgh.test.alone.stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OutPut_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        String s = "";

        while ((s = br.readLine()) != null){
            System.out.println(s);
        }
    }
}