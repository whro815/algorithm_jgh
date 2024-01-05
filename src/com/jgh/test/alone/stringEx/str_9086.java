package com.jgh.test.alone.stringEx;

import java.util.Scanner;

public class str_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String str ="";

        for (int i = 0; i < num; i++) {
            str = sc.next();
            System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
        }

    }
}
