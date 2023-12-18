package com.jgh.test.ch1;

// 알파벳 대소문자로 된 단어 (대소문자 구분 X)
// 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램
// 나열된 알파벳 개수가 일치하는 경우 ex) AABCC => A는 2개 B는 1개 C는 2개 => A와 C가 같으므로 '?' 출력
// Mississipi = > ?
// zzA => Z
import java.util.Scanner;

public class String_1157 {

    public static int[] getAlpahabetCount(String str){
        int [] count = new int[26];
        for(int i = 0; i < str.length(); i++){
            count[str.charAt(i) - 'A']++;   // toUpperCase
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toUpperCase();
        int[] count = getAlpahabetCount(str);

        int maxCount = -1;
        char maxAlphabet = '?';
        //I:4, M:1, P:1, S:4
        for (int i = 0; i < 26; i++) {
            if(count[i] > maxCount) {
                maxCount = count[i];
                maxAlphabet = (char) ('A'+ i);
            }else if(count[i] == maxCount){
                maxAlphabet = '?';
            }
        }

        System.out.print(maxAlphabet);

    }

}