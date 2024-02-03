package com.jgh.test.alone.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class deque_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());    // 1. i < n

        for (int i = 0; i < n; i++) {

            String[] x = br.readLine().split(" ");

            // first switch str
            switch (x[0] ){
                case "push_front" :
                    // 정수 X를 덱의 앞에 넣는다
                    deque.addFirst(Integer.parseInt(x[1]));
                    break;
                case "push_back" :
                    // 정수 X를 덱의 뒤에 넣는다.
                    deque.addLast(Integer.parseInt(x[1]));
                    break;
                case "pop_front" :
                    // 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력
                    sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
                    break;
                case "pop_back" :
                    // 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력
                    sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
                    break;
                case "size" :
                    // 덱에 들어있는 정수의 개수를 출력한다.
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty" :
                    // 덱이 비어있으면 1을, 아니면 0을 출력한다.
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front" :
                    // 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                    sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
                    break;
                case "back" :
                    // 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                    sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
