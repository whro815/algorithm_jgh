package com.jgh.test.alone.loop;


import java.io.*;
import java.util.StringTokenizer;

public class AplusBmius7_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));   // input
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // output

        StringTokenizer st; // 문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스

        int T = Integer.parseInt(bf.readLine());    // 예) 5 입력

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(bf.readLine());
            bw.write("Case #"+ (i+1) +": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }

        bw.close();
    }
}
