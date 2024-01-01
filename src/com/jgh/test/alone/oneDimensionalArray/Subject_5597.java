package com.jgh.test.alone.oneDimensionalArray;

import java.util.Scanner;

public class Subject_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] students = new int[31];

        for (int i = 1; i < 29; i++) { //출석한 학생
            int ok = sc.nextInt();
            students[ok] = 1;       // true
        }

        for (int i = 1; i < students.length; i++) {
            if(students[i] != 1){   // false
                System.out.println(i);
            }
        }

        sc.close();
    }
}
