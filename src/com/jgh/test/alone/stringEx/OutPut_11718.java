package com.jgh.test.alone.stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OutPut_11718 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true){
            String str = br.readLine();

            if(str == null || str.isEmpty()){
                break;
            }

            sb.append(str).append("\n");
        }

        System.out.println(sb);

    }
}