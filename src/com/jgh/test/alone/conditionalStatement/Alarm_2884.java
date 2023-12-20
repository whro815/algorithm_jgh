package com.jgh.test.alone.conditionalStatement;

import java.util.Scanner;

public class Alarm_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if(m < 45){  // 분이 45분보다 작은지 (min < 45)

            h = h - 1;          // 시 감소
            m = 60 -(45 - m);   // 분 감소 **

            if(h < 0){  // 시가 0 보다 작은지 ( hour < 0 )
                h = 23;
            }
            System.out.println(h + " " + m);

        } else {
            System.out.println(h + " " + (m - 45));
        }// 분이 45분보다 크거나 같은지

    }
}
