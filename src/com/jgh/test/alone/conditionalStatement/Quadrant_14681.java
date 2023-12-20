package com.jgh.test.alone.conditionalStatement;

import java.util.Scanner;

public class Quadrant_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long x = sc.nextLong();
        Long y = sc.nextLong();

        if(x > 0){  // x좌표 양수

            if(y > 0){  // y좌표 양수
                System.out.println("1");
            } else {    // y좌표 음수
                System.out.println("4");
            }

        } else {    // x좌표 음수

            if(y > 0){  // y좌표 양수
                System.out.println("2");
            } else {    // y좌표 음수
                System.out.println("3");
            }

        }

    }
}
