package com.jgh.test.alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CenterShiftAlgorithm_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());      // 예) 점 1 => 2 + 1 = 3, 3 * 3 = 9

        int dot = (int)Math.pow(2, N) + 1;  // 거듭제곱근 pow(대상숫자, 지수)

        System.out.println(dot * dot);

        br.close();
    }
}
