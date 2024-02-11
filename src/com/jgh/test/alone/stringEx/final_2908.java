package com.jgh.test.alone.stringEx;

import java.util.Scanner;

public class final_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fst = sc.nextInt();
        int sec = sc.nextInt();

        fst = Integer.parseInt(new StringBuilder().append(fst).reverse().toString());
        sec = Integer.parseInt(new StringBuilder().append(sec).reverse().toString());

        System.out.println(fst > sec ? fst : sec);
    }
}
