package com.jgh.test.alone.loop;

import java.util.Scanner;

public class AplusBmius5_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == 0 && b == 0){
                sc.close();
                break;
            }
            System.out.println(a+b);
        }

    }
}
