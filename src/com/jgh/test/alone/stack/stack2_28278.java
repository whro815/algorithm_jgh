package com.jgh.test.alone.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stack2_28278 {

    static Stack<Integer> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while(N --> 0){
            solution(br.readLine());
        }

        br.close();

        System.out.println(sb);

    }

    static void solution(String br){

        char i = br.charAt(0);

        // query.substring(2);를 한 이유는 공백도 문자로 포함하기 때문이다 1 X 형태이기 때문에 X의 인덱스는 2다.
        switch (i){
            case '1': stack.push(Integer.parseInt(br.substring(2))); return;                // 1. 스택을 넣는다.
            case '2': sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n"); return;   // 2. 스택이 비어있다면 1 출력, 스택에 정수가 있다면 맨 위의 정수를 빼고 출력
            case '3': sb.append(stack.size()).append("\n"); return;                         // 3. 스택에 들어있는 정수의 개수 출력
            case '4': sb.append(stack.isEmpty() ? 1 : 0).append("\n"); return;              // 4. 스택이 비어있다면 1 출력, 없다면 0
            case '5': sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n"); return;  // 5. 스택에 정수가 있다면 맨 위의 정수 출력, 없다면 -1
            default: break;
        }

    }
}
