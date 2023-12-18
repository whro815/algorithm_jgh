package com.jgh.test.ch1;
// 알파벳과 단어의 개수가 일치하는것 = 애너그램
// 두 영어 단어가 철자의 순서를 뒤바꾸어 같아질 수 있을 때, 그러한 두 단어를 서로 애너그램 관계
// occurs 라는 영어 단어와 succor 는 서로 애너그램 관계
// dared와 bread는 서로 애너그램 관계에 있지 않다.
// dared 맨 앞 'd' 제거 , bread에 맨앞 'b'를 제거
// ared와 read 라는 애너그램 관계 형성
// 애너그램 관계에 있도록 만들기 위해서 제거해야 하는 최소 개수의 문자 수를 구하는 프로그램 작성

// 내가 생각한 방법
// 1. 문자열 총합산 길이 만큼 돌리고
// 2. 그안에서 중복되지 않은 값을 빼고
// 3. 뺀 값들은  cnt ++;
import java.util.Scanner;

public class String_1919 {

    public static int[] getAlpahabetCount(String str){      // countA , countB 를 함수 재사용으로 빼놓음
        int [] count = new int[26];
        for(int i = 0; i < str.length(); i++){
            count[str.charAt(i) - 'a']++;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int[] countA = new int[26];
        int[] countB = new int[26];
        for(int i = 0; i< a.length(); i++){
            countA[a.charAt(i) - 'a']++;
        }
        for(int i = 0; i< b.length(); i++){
            countB[b.charAt(i) - 'a']++;
        }

        int ans = 0;
        for (int i = 0; i < 26; i++){

            if(countA[i] > countB[i])  ans += countA[i] - countB[i];
            else if(countB[i] > countA[i]) ans += countB[i] - countA[i];

           // ans += Math.abs(countA[i] - countB[i]); // 2. abs 절대값 구하는 -> 1 - 0 = 1 , 0 - 1 = 0
        }
        System.out.print(ans);
    }
}
