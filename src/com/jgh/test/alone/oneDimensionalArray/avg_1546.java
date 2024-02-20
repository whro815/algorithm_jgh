package com.jgh.test.alone.oneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class avg_1546 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // N : 과목의 개수
        int N = sc.nextInt();

        // arr = 점수 배열
        double arr[] = new double[N];

                
        for (int i = 0; i < N; i++) {
            // 과목 점수 10에 -2승까지만
            arr[i] = sc.nextDouble();
        }

        // 누적 점수
        double sum = 0;
        
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            // 모든 점수를 점수/M*100
            sum += ((arr[i] / arr[arr.length-1]) * 100);
        }

        System.out.print(sum / arr.length);
        
    }
}
