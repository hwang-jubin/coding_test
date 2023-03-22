import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();

            }
        }

        //// 이중 배열 출력하기
        // for (int[] row : arr) {
        // for (int element : row) {
        // System.out.println(element + " ");
        // }
        // }

        int[] plus = new int[n];

        for (int i = 0; i < n; i++) {
            plus[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (arr[i][j] == arr[j][k]) {
                        plus[j] += 1;

                    }

                }
            }
        }
        // for(int x: plus){
        // System.out.println(x);
        // }
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (plus[i] > plus[i - 1]) {
                answer = i + 1;
            }

        }

        System.out.println(answer);

    }
}
