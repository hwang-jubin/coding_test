import java.util.*;

//LRU
public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = kb.nextInt();
        }

        int[] answer = new int[n];
        for (int x : arr) {
            int pos = -1;

            for (int i = 0; i < n; i++) {
                if (answer[i] == x) {
                    pos = i;
                }
            }

            if (pos == -1) {
                for (int i = n - 1; i >= 1; i--) {
                    answer[i] = answer[i - 1];
                }
                answer[0] = x;
            } else {
                for (int i = pos; i >= 1; i--) {
                    answer[i] = answer[i - 1];
                }
                answer[0] = x;
            }
        }

        for (int x : answer) {
            System.out.print(x + " ");
        }
    }
}
