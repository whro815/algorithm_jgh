package com.jgh.test.alone.stringEx;

import java.util.Scanner;

public class dial_5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toUpperCase();

        int count = 0;

        int strLen = str.length();

        for (int i = 0; i < strLen; i++) {

            switch (str.charAt(i)){
                case 'A': case 'B': case 'C':
                    // 숫자 2 일 경우, 시간 3초
                    count += 3;
                    break;
                case 'D': case 'E': case 'F':
                    // 숫자 3 일 경우, 시간 4초
                    count += 4;
                    break;
                case 'G': case 'H': case 'I':
                    // 숫자 4 일 경우, 시간 5초
                    count += 5;
                    break;
                case 'J': case 'K': case 'L':
                    // 숫자 5 일 경우, 시간 6초
                    count += 6;
                    break;
                case 'M': case 'N': case 'O':
                    // 숫자 6 일 경우, 시간 7초
                    count += 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    // 숫자 7 일 경우, 시간 8초
                    count += 8;
                    break;
                case 'T': case 'U': case 'V':
                    // 숫자 8 일 경우, 시간 9초
                    count += 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    // 숫자 9 일 경우, 시간 10초
                    count += 10;
                    break;
            }

        }

        System.out.println(count);
    }
}
