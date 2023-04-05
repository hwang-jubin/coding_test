import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        Stack<Character> stack = new Stack<>();

        String answer = "YES";

        for (char x : str.toCharArray()) {
            if (x == '(')
                stack.push(x);
            else {
                if (stack.isEmpty()) {
                    answer = "NO";
                    break;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            answer = "NO";
        }

        System.out.println(answer);
    }

}
