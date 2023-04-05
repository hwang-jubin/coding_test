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

        TreeSet<Integer> tre = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    tre.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }

        int cnt = 0;
        int answer = -1;
        for (int x : tre) {
            cnt++;
            if (cnt == m) {
                answer = x;
                break;
            }

        }

        System.out.println(answer);
    }

}
