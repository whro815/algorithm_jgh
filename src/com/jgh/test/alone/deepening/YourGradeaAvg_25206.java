package com.jgh.test.alone.deepening;

import java.io.*;
import java.util.StringTokenizer;

public class YourGradeaAvg_25206 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double sumScore = 0;
        double sumNum = 0;

        for (int i = 0; i < 20; i++) {

            st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();  // 과목명
            double num = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();    // 등급
            double score = 0;                 // 추후 등급에 맞는 점수 받기

            if (!(grade.equals("P"))) { // P가 아닐때만
                switch (grade) {
                    case "A+":
                        score = 4.5;
                        break;
                    case "A0":
                        score = 4.0;
                        break;
                    case "B+":
                        score = 3.5;
                        break;
                    case "B0":
                        score = 3.0;
                        break;
                    case "C+":
                        score = 2.5;
                        break;
                    case "C0":
                        score = 2.0;
                        break;
                    case "D+":
                        score = 1.5;
                        break;
                    case "D0":
                        score = 1.0;
                        break;
                    case "F":
                        score = 0.0;
                        break;
                    default:
                        break;
//                    if (grade.equals("A+")) {
//                        score = 4.5;
//                    } else if(grade.equals("A0")) {
//                        score = 4.0;
//                    } else if(grade.equals("B+")) {
//                        score = 3.5;
//                    } else if(grade.equals("B0")) {
//                        score = 3.0;
//                    } else if(grade.equals("C+")) {
//                        score = 2.5;
//                    } else if(grade.equals("C0")) {
//                        score = 2.0;
//                    } else if(grade.equals("D+")) {
//                        score = 1.5;
//                    } else if(grade.equals("D0")) {
//                        score = 1.0;
//                    } else if(grade.equals("F")) {
//                        score = 0.0;
//                    }

                }

                sumScore += (num * score);
                sumNum += num;      // 개수 누적


            }
        }

        System.out.printf("%.6f", sumScore/sumNum);
        br.close();
    }
}
