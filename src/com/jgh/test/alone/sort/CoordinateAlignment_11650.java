package com.jgh.test.alone.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CoordinateAlignment_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;

        int[][] coordinates = new int[n][2];

        for (int i = 0; i < n; i++) {
          st = new StringTokenizer(br.readLine());

          int f = Integer.parseInt(st.nextToken());
          int d = Integer.parseInt(st.nextToken());

          coordinates[i][0] = f;
          coordinates[i][1] = d;
        }

        Arrays.sort(coordinates,(f, d) ->{
            if(f[0] == d[0]){
                return Integer.compare(f[1],d[1]);
            }
            return Integer.compare(f[0], d[0]);
        });


        for (int i = 0; i < n; i++) {
            System.out.println(coordinates[i][0]+" "+coordinates[i][1]);
        }

    }
}
