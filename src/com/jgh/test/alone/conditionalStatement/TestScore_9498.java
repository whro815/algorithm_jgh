package com.jgh.test.alone.conditionalStatement;

import java.util.Scanner;

public class TestScore_9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int examScore = sc.nextInt();

        if( 90 <= examScore && examScore <= 100 ){
            System.out.println("A");
        } else if( 80 <= examScore && examScore <= 89 ){
            System.out.println("B");
        } else if( 70 <= examScore && examScore <= 79 ){
            System.out.println("C");
        } else if( 60 <= examScore && examScore <= 69 ){
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}
