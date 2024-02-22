package com.jgh.test.alone.deepening;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class sprout_25083 {
    public static void main(String[] args) throws Exception{

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        sb.append("         ,r'\"7\n")
          .append("r`-_   ,'  ,/\n")
          .append(" \\. \". L_r'\n")
          .append("   `~\\/\n")
          .append("      |\n")
          .append("      |");

        bw.write(sb.toString());
        bw.close();
    }
}
