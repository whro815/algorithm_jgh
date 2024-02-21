package com.jgh.test.alone.stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class saltBomb_13223 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 현재 시간
        String []currentTime = br.readLine().split(":");

        // 현재 시, 분, 초
        int currentHour    = Integer.parseInt(currentTime[0]);
        int currentMinute  = Integer.parseInt(currentTime[1]);
        int currentSeconds = Integer.parseInt(currentTime[2]);

        // 투하 시간
        String []dropTime = br.readLine().split(":");

        br.close();

        // 투하 시, 분, 초
        int dropHour    = Integer.parseInt(dropTime[0]);
        int dropMinute  = Integer.parseInt(dropTime[1]);
        int dropSeconds = Integer.parseInt(dropTime[2]);

        // 현재 시분초를 시 -> 초, 분 -> 초 , 초 변환후 전부 더하기
        int currentHmsTotal = currentHour * 3600 + currentMinute * 60 + currentSeconds;

        // 투하 시분초를 시 -> 초, 분 -> 초 , 초 변환후 전부 더하기
        int dropHmsTotal = dropHour * 3600 + dropMinute * 60 + dropSeconds;

        // 총 투하 시분초 - 총 현재 시분초 = 필요 시분초
        int necessaryHmsTotal = dropHmsTotal - currentHmsTotal;
        if (necessaryHmsTotal <= 0){
            // necessaryHmsTotal = necessaryHmsTotal + 24(하루) * 3600
            necessaryHmsTotal += 24 * 3600;
        }

        // 다시 시, 분, 초로 변경
        int necessaryHour = necessaryHmsTotal / 3600;
        int necessaryMinute = (necessaryHmsTotal % 3600) / 60;
        int necessarySeconds = necessaryHmsTotal % 60;

        System.out.printf("%02d:%02d:%02d", necessaryHour, necessaryMinute, necessarySeconds);
    }
}