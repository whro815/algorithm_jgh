package com.jgh.test.alone.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortInSide_1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Character[] charArr = new Character[str.length()];


        for (int i = 0; i < str.length(); i++) {
            charArr[i] = str.charAt(i);
        }

        Arrays.sort(charArr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (char i: charArr) {
            sb.append(i);
        }

        System.out.print(sb);
    }
}
