package Day25_427.学分绩点;

import java.util.Scanner;

public class Main {
    public static double GPA(int n, int[] fen, int[] score){
        double[] jidianOne = new double[n];
        for (int i = 0; i < n; i++) {
            if(score[i] < 60)
                jidianOne[i] = 0.0 * fen[i];
            if(score[i] >= 60 && score[i] <= 63)
                jidianOne[i] = 1.0 * fen[i];
            if(score[i] >= 64 && score[i] <= 67)
                jidianOne[i] = 1.5 * fen[i];
            if(score[i] >= 68 && score[i] <= 71)
                jidianOne[i] = 2.0 * fen[i];
            if(score[i] >= 72 && score[i] <= 74)
                jidianOne[i] = 2.3 * fen[i];
            if(score[i] >= 75 && score[i] <= 77)
                jidianOne[i] = 2.7 * fen[i];
            if(score[i] >= 78 && score[i] <= 81)
                jidianOne[i] = 3.0 * fen[i];
            if(score[i] >= 82 && score[i] <= 84)
                jidianOne[i] = 3.3 * fen[i];
            if(score[i] >= 85 && score[i] <= 89)
                jidianOne[i] = 3.7 * fen[i];
            if(score[i] >= 90 && score[i] <= 100)
                jidianOne[i] = 4.0 * fen[i];
        }
        double sum1 = 0.0;
        double sum2 = 0.0;
        for (int i = 0; i < n; i++) {
            sum1 += jidianOne[i];
            sum2 += fen[i];
        }
        return (double) sum1/sum2;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] fen = new int[n];  //每门课学分
        int[] score = new int[n];//每门课成绩
        for (int i = 0; i < n; i++) {
            fen[i] = in.nextInt();
        }
        for (int j = 0; j < n; j++) {
            score[j] = in.nextInt();
        }
        System.out.printf("%.2f",GPA(n,fen,score));
    }
}
