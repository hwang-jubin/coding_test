import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        int answer = 0;
        int pi = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n - pi; j++) {
                sum += arr[pi + j];
                if (sum == m) {
                    answer++;
                    break;
                }
            }
            pi++;

        }

        System.out.println(answer);
    }

}
