package com.jgh.test.alone.conditionalStatement;

import java.util.Scanner;

public class Dice_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();

        if(a == b && b == c){   // 3 개 일치
            System.out.println(10000 + a * 1000);
        } else if(a == b){  // 2개 일치
            System.out.println(1000 + a * 100);
        } else if(b == c){  // 2개 일치
            System.out.println(1000 + b * 100);
        } else if(a == c){  // 2개 일치
            System.out.println(1000 + c * 100);
        } else {    // 전부 다를때

            if(a > b && a > c) { // a가 가장 클때
                System.out.println(a * 100);
            } else if(b > a && b > c){  // b가 가장 클때
                System.out.println(b * 100);
            } else if(c > a && c > b) { // c가 가장 클때
                System.out.println(c * 100);
            }
        }

    }
}
