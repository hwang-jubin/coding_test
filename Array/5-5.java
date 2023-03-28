import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char[] arr = str.toCharArray();

        Stack<Character> stack = new Stack<>();
        int answer = 0;

        for (int i = 0; i < str.length(); i++) {
            if (arr[i] == '(') {
                stack.push(arr[i]);
            } else if (arr[i] == ')' && arr[i - 1] == '(') {
                stack.pop();
                answer += stack.size();
            } else if (arr[i] == ')' && arr[i - 1] == ')') {
                stack.pop();
                answer++;
            }
        }
        System.out.println(answer);
    }
}
