package com.jgh.test.alone;

import java.util.Scanner;

public class AplusB_1000 {

    public static int getPlus(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(getPlus(a, b));
    }

}
