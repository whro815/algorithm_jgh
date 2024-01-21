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
            q.offer(i);
        }

        while(q.size() > 1){
            q.poll();
            q.offer(q.poll());
        }
        System.out.println(q.poll());
    }
}
