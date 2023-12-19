package com.jgh.test.alone;

import java.util.Scanner;

public class AmultiplicationB_10998 {

    public static int getMulti(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(getMulti(a, b));
    }
}
