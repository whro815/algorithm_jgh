package com.jgh.test.alone.deepening;

import java.util.Scanner;

public class Croatia_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if ( c == 'c') {
                if (i < s.length() - 1) {
                    if (s.charAt(i+1) == '=') {          // 다음 인덱스 '='
                        i++;
                    } else if(s.charAt(i+1) == '-') {    // 다음 인덱스 '-'
                        i++;
                    }
                }
            } else if ( c == 'd') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'z') {          // 'd' 다음 인덱스 'z'
                        if (i < s.length() - 2) {
                            if (s.charAt(i + 2) == '=') {  // 'dz' 다음 인덱스 '='
                                i += 2;
                            }
                        }
                    } else if(s.charAt(i + 1) == '-') {    // 'd' 다음 인덱스 '-'
                        i++;
                    }
                }
            } else if ( c == 'l') {
                if(i < s.length() - 1){
                    if(s.charAt(i + 1) == 'j') {           // 'l' 다음 인덱스 'j'
                        i++;
                    }
                }
            } else if ( c == 'n') {
                if(i < s.length() - 1){
                    if(s.charAt(i + 1) == 'j') {           // 'n' 다음 인덱스 'j'
                        i++;
                    }
                }
            } else if ( c == 's') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == '=') {           // 's' 다음 인덱스 '='
                        i++;
                    }
                }
            } else if ( c == 'z') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == '=') {           // 'z' 다음 인덱스 '='
                        i++;
                    }
                }
            }

            cnt++;
        }

        System.out.print(cnt);
    }
}
