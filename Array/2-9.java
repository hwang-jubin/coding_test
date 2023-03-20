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
        int answer = -2147000000;
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum = 0;
            sum2 = 0;
            for (int j = 0; j < n; j++) {

                sum += arr[i][j];
                sum2 += arr[j][i];

            }
            answer = Math.max(answer, sum);
            answer = Math.max(answer, sum2);
        }
        sum = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
            sum2 += arr[i][n - 1 - i];

        }
        answer = Math.max(answer, sum);
        answer = Math.max(answer, sum2);

        // 이중 배열 출력하기
        // for (int[] row : arr) {
        // for (int element : row) {
        // System.out.print(element + " ");
        // }
        //
        // }
        System.out.println(answer);
    }
}
