import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] doll = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                doll[i][j] = kb.nextInt();
            }
        }
        int len = kb.nextInt();
        int[] lenStack = new int[len];
        for (int i = 0; i < len; i++) {
            lenStack[i] = kb.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int x : lenStack) {
            for (int i = 0; i < doll.length; i++) {
                if (doll[i][x - 1] != 0) {
                    int temp = doll[i][x - 1];
                    doll[i][x - 1] = 0;
                    if (!stack.isEmpty() && temp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else
                        stack.push(temp);
                    break;
                }

            }
        }
        System.out.println(answer);
    }
}
