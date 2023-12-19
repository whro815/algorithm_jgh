package com.jgh.test.alone.intputOutput;

import java.util.Scanner;

public class Surprised_10926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        System.out.println( Integer.parseInt(a) * Integer.parseInt(b.substring(2)) );
        System.out.println( Integer.parseInt(a) * Integer.parseInt(b.substring(1,2)) );
        System.out.println( Integer.parseInt(a) * Integer.parseInt(b.substring(0,1)) );
        System.out.println( Integer.parseInt(a) * Integer.parseInt(b) );

    }
}
