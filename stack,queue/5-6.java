import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        Queue<Integer> que = new LinkedList<>();
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            que.offer(i);
        }
        while (!que.isEmpty()) {
            for (int i = 1; i < m; i++)
                que.offer(que.poll());

            que.poll();
            if (que.size() == 1)
                answer = que.poll();
        }
        System.out.print(answer);
    }

}