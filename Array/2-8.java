import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] score = new int[num];
        ;
        for (int i = 0; i < num; i++) {
            score[i] = in.nextInt();
        }
        int[] rank = new int[num];

        for (int i = 0; i < num; i++) {
            int cnt = 1;
            for (int j = 0; j < num; j++) {
                if (score[i] < score[j]) {
                    cnt++;
                }
            }
            rank[i] = cnt;

        }

        for (int x : rank)
            System.out.print(x + " ");

    }
}