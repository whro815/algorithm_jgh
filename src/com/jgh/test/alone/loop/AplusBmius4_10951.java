package com.jgh.test.alone.loop;

import java.util.Scanner;

public class AplusBmius4_10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // hasNextInt() 의 경우 입력값이 정수일경우 true를 반환하며 정수가 아닐경우
        // 바로 예외를 던지며 더이상의 입력을 받지 않고 hasNextInt()에서 false를 반환하면서 반복문이 종료
        while (sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a+b);
        }
        sc.close();
    }
}
