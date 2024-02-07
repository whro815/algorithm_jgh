package com.jgh.test.alone.oneDimensionalArray;

import java.io.*;
import java.util.StringTokenizer;

public class PutTheBall_10810 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int []arr = new int[N];
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < M; i++) {

            st = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            for (int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }

        for (int k = 0; k < arr.length; k++) {
            bw.write(arr[k] + " ");
        }

        br.close();
        bw.flush(); // stream 을 닫지 않은 상태에서 byte를 보내고 싶은 경우, 즉 스트림을 닫아서는 안되는 경우 flush
        bw.close();
    }
}
