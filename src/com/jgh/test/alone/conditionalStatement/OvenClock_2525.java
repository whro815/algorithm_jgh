package com.jgh.test.alone.conditionalStatement;

import java.util.Scanner;

public class OvenClock_2525 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

        int secondSet = sc.nextInt();

        min = hour * 60 + min;  // min = 60 * 시 + 분
        min = min + secondSet;  // 요리하는데 걸린 시간

        hour = (min / 60) % 24; // 시
        min = min % 60;         // 분

        System.out.println(hour + " " + min);
    }
}
