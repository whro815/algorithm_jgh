package com.jgh.test.alone.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class deque2_28279 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new LinkedList<>();

        for(int i =0; i< n; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());

            switch (x) {
                case 1:
                    // 정수 x를 덱의 앞에 넣는다.
                    deque.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    // 정수 x를 덱의 뒤에 넣는다.
                    deque.offer(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    // 덱에 정수가 잇다면 맨 앞의 정수를 배고 출력
                    // 없다면 -1 대신 출력
                    sb.append(deque.isEmpty() ? -1 : deque.poll()).append("\n");
                    break;
                case 4:
                    // 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력
                    // 없다면 -1 대신 출력
                    sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
                    break;
                case 5:
                    // 덱에 들어있는 정수의 개수를 출력
                    sb.append(deque.size()).append("\n");
                    break;
                case 6:
                    // 덱이 비어있다면 1, 아니면 0 을 출력
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 7:
                    // 덱에 정수가 있다면 맨 앞의 정수를 출력
                    // 없다면 -1 을 대신 출력
                    sb.append(deque.isEmpty() ? -1 : deque.peek()).append("\n");
                    break;
                case 8:
                    // 덱에 정수가 있다면 맨 뒤의 정수를 출력
                    // 없다면 -1 을 대신 출력
                    sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
