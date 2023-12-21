package com.jgh.test.alone.loop;

import java.util.Scanner;

public class Receipt_25304 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();       // 260,000
        int n = sc.nextInt();       // 4

        int arr[] = new int [n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[i] = a * b;     // a[0] = a * b
        }

        int usrNum = 0;

        for (int i : arr) {
            usrNum += i;    // 각 지폐 및 물건 갯수 누적합
        }

        if(x == usrNum){    // 사용자 총합 금액 == 영수증 금액
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
