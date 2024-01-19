package com.jgh.test.alone.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Josephus_11866 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        int n = sc.nextInt(); // total
        int k = sc.nextInt(); // start number

        for (int i = 1; i <= n ; i++) {
                queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        while (queue.size() > 1){
            for (int i = 0; i < k - 1; i++) {
                int val = queue.poll();
                queue.offer(val);
            }
            sb.append(queue.poll()).append(", ");

        }

        sb.append(queue.poll()).append('>');
        System.out.println(sb);
    }
}
