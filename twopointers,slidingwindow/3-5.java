import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        int answer = 0;
        int lt = 1;
        int sum = 0;
        for (int rt = 1; rt <= n / 2 + 1; rt++) {

            sum += arr[rt];
            if (sum == n)
                answer++;
            while (sum > n) {
                sum -= arr[lt++];
                if (sum == n)
                    answer++;
            }
            ;

        }

        System.out.println(answer);
    }

}
