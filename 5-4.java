import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String arr = kb.next();

        Stack<Integer> stack = new Stack<>();

        for (char x : arr.toCharArray()) {
            switch (x) {
                case '+':
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a + b);
                    break;
                case '-':
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b - a);
                    break;
                case '*':
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a * b);
                    break;
                case '/':
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b / a);
                    break;
                default:
                    stack.push(x - '0'); // 문자를 숫자로 변환하여 스택에 저장
                    break;
            }
        }
        System.out.println(stack.pop());
    }
}
