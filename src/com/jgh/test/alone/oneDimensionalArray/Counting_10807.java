package com.jgh.test.alone.oneDimensionalArray;

import java.util.Scanner;

public class Counting_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vTotal = sc.nextInt();      // 정수의 개수 N
        int num = 0;                    // 정수가 공백으로 구분
        int arrNum[] = new int[vTotal];

        for (int i = 0; i < vTotal; i++) {
            num = sc.nextInt();
            arrNum[i] = num;
        }

        int sumNum = 0;
        int searchN = sc.nextInt(); // 나열된 정수중에서 입력한 정수 갯수 찾기

        for (int i:arrNum) {
            if(i == searchN){
                sumNum++;
            }
        }

        System.out.println(sumNum);
    }
}
