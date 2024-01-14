package com.jgh.test.alone.stack;

import java.util.Scanner;
import java.util.Stack;

public class barcket_9012 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tot = sc.nextInt();

        for(int i=0; i < tot; i++){
            System.out.println(solve(sc.next()));
        }

    }

    static String solve(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(') {
                // 여는 괄호일 경우 스택 push
                stack.push(c);
            } else if (stack.empty()) {
                // 닫는 괄호 입력 시 스택에 pop 할 괄호가 없을 경우
                return "NO";
            } else {
                // 그 외 스택 pop
                stack.pop();
            }

        }

        // 위 검사 끝나고 요소가 있으면 NO
        // 스택이 비어있으면 YES
        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
