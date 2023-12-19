package com.jgh.test.alone.intputOutput;

import java.util.Scanner;

public class AdivisionB_1008 {

    public static double getDivision(double a, double b){
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        double b = sc.nextInt();

        System.out.println(getDivision(a, b));
    }
}
