import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();// 학생 수
        int m = kb.nextInt();// 시험 횟수
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) { // 행
            for (int j = 0; j < n; j++) { // 열
                arr[i][j] = kb.nextInt();

            }
        }

        int answer = 0;

        // i= 멘토 j= 멘티
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    for (int s = 0; s < n; s++) {
                        int mento = 0;
                        int menty = 0;
                        if (arr[k][s] == i) {
                            mento = s;
                        }
                        if (arr[k][s] == j) {
                            menty = s;
                        }

                        if (mento > menty) {
                            cnt++;
                        }

                    }
                }

                if (cnt == m) {
                    answer++;
                }

            }
        }

        System.out.println(answer);
    }
}
