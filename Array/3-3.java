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

        int pi = m;
        int answer = Integer.MIN_VALUE;

        while (pi < n) {
            int add = 0;
            for (int i = pi - m; i < pi; i++) {
                add += arr[i];
            }
            if (answer < add) {
                answer = add;
            }
            pi++;

        }
        System.out.println(answer);
    }
}
