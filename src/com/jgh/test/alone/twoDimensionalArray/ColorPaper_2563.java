package com.jgh.test.alone.twoDimensionalArray;

import java.util.Scanner;

public class ColorPaper_2563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] paper = new int[100][100]; // 종이 표시 배열

        int n = scanner.nextInt(); // 색종이의 갯수 예) 3개

        // 각 색종이의 위치를 입력받아 배열에 표시
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            markPaper(paper, x, y);
        }

        // 색종이가 붙은 부분의 넓이 계산
        int area = calculateArea(paper);
        System.out.println(area);
    }

    // 색종이가 붙은 부분을 1로 표시
    static void markPaper(int[][] paper, int x, int y) {
        for (int i = x; i < x + 10; i++) {
            for (int j = y; j < y + 10; j++) {
                paper[i][j] = 1;
            }
        }
    }

    // 색종이가 붙은 부분의 넓이를 계산
    static int calculateArea(int[][] paper) {
        int area = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j] == 1) {
                    area++;
                }
            }
        }
        return area;
    }

}
