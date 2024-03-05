package com.jgh.test.alone.twoDimensionalArray;

import java.util.Scanner;

public class LengthRead_10798 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2차원 배열 생성
        char[][] charArray = new char[5][15];

        for (int i = 0; i < 5; i++) {   // 5 고정
            String str = sc.next();
            for (int j = 0; j < str.length(); j++) { // 내가 입력한 문자열 길이
                charArray[i][j] = str.charAt(j);
            }
        }

        // 배열 요소 출력
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if('\0' != charArray[j][i]){
                        System.out.print(charArray[j][i]);
                }
            }
        }

    }
}
