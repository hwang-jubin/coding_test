import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        Queue<Character> a = new LinkedList<>();
        String answer = "YES";

        for (char x : kb.next().toCharArray())
            a.offer(x);
        for (char x : kb.next().toCharArray()) {
            if (a.contains(x)) {
                if (x != a.poll()) {
                    answer = "NO";
                    break;
                }
            }
        }
        if (!a.isEmpty())
            answer = "NO";

        System.out.print(answer);
    }

}