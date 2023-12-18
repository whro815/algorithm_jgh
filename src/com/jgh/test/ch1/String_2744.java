package com.jgh.test.ch1;

// 입력한 문자열을
// 소문자는 대문자로, 대문자는 소문자로 변경한 문자열 출력
import java.util.Scanner;

public class String_2744 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.next();     // 입력

        for (int i=0; i< str.length(); i++){

            char ch =str.charAt(i);

            if('A' <= ch && ch <='Z'){      // 문자 A ~ Z 까지
                System.out.print((char)('a' + ch - 'A'));
            }else {
                System.out.print((char)('A' + ch - 'a'));
            }
        }

    }
}
