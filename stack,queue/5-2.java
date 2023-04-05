import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        ArrayList<Character> answer = new ArrayList<>();
        Stack<Character> stack = new Stack<>();

        int lenStack = 0;
        for (char x : str.toCharArray()) {
            if (x == '(') {
                stack.push(x);
                lenStack++;
            } else if (x == ')') {
                stack.pop();
                lenStack--;
            } else {
                if (lenStack == 0)
                    answer.add(x);
            }
        }

        for (char x : answer) {
            System.out.print(x);
        }
    }
}
