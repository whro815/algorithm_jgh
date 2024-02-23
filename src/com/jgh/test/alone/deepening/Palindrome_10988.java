package com.jgh.test.alone.deepening;

import java.util.Scanner;

public class Palindrome_10988 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int result = 1;

        for (int i = str.length() - 1; i >= 0; i--) {   // 뒤에서부터
            char c = str.charAt(i);

            if(c != str.charAt(str.length()-i-1)){  //  예) 글자 5  0  글자 4  1
                result = 0;
                break;
            }
        }

        System.out.print(result);

    }
}
