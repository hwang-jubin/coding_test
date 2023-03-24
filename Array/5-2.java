import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        ArrayList<Character> answer = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        // 지금부터 (가 나올 때 까지 출력
        for (char x : str.toCharArray()) {
            if (x == '(')
                stack.push(x);
            else if (x == ')') {
                stack.pop();
            } else if (stack.isEmpty()) {
                answer.add(x);

            }
        }

        for (char x : answer) {
            System.out.print(x);
        }
    }

}
