package com.jgh.test.alone.intputOutput;

import java.util.Scanner;

public class AminusB_1001 {

    public static int getMinus(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(getMinus(a, b));
    }

}
