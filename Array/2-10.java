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
        // 사방으로 비교
        int[] dx = { -1, 0, 1, 0 };
        int[] dy = { 0, 1, 0, -1 };
        int answer = 0;
        // 모든 n개의 격자를 비교한 것이기 때문에, 시간복잡도는 n
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int ax = i + dx[k];
                    int ay = j + dy[k];
                    // 사방이 더 클 경우 봉우리가 아님, 격자 바깥으로 나가지 않게 조건을 잡아줌
                    if (ax >= 0 && ax < n && ay >= 0 && ay < n && arr[i][j] <= arr[ax][ay]) {
                        flag = false;
                        // if의 조건문에서 봉우리가 아닌 것 으로 판명나면, 가장 안쪽의 for 문을 빠져나옴
                        break;
                    }

                }
                if (flag)
                    answer++;

            }

        }

        System.out.println(answer);
    }
}
