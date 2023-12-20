package com.jgh.test.alone.conditionalStatement;

import java.util.Scanner;

public class LeapYear_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if( x%4 == 0){  //4의 배수일 경우
            if( x%400 == 0){    // 400의 배수일 경우
                System.out.println("1");
            } else if( x%100 == 0){ // 100의 배수일 경우
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        } else {
            System.out.println("0");
        }

    }
}
