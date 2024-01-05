package com.jgh.test.alone.stringEx;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class charAndString_27866 {
    public static void main(String[] args) throws IOException {
/*        Scanner sc = new Scanner(System.in);

        // S
        String s = sc.next();
        // i
        int i = sc.nextInt()-1;

        System.out.print(s.charAt(i));*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        StringTokenizer st;

        int i = Integer.parseInt(br.readLine());

        st = new StringTokenizer(s);

        bw.write(String.valueOf(st).charAt(i));

    }
}
