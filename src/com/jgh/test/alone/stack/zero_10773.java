package com.jgh.test.alone.stack;

import java.util.Scanner;
import java.util.Stack;

public class zero_10773 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tot = sc.nextInt();

        int x = 0;

        Stack<Integer> stack = new Stack<>(); //int형 스택 선언

        while (tot > 0){
            tot--;
            x = sc.nextInt();
            if(x == 0){
                stack.pop();
            } else {
                stack.push(x);
            }
        }

        int sum = 0;
        for (int i: stack) {
            sum += i;
        }
        System.out.print(sum);

    }
}
