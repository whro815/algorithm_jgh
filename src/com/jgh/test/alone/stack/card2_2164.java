package com.jgh.test.alone.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class card2_2164 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();

        int n = in.nextInt();

        for(int i = 1; i <= n; i++){
            q.offer(i);     // 값 추가
        }

        while(q.size() > 1){
            q.poll();           // 값 빼기
            q.offer(q.poll());  // Queue에 첫번째 값을 반환하고 제거 비어있다면 null
        }
        System.out.println(q.poll());
    }
}
