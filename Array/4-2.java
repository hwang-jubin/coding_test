import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String arr1 = kb.next();
        String arr2 = kb.next();
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char key : arr1.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (char key : arr2.toCharArray()) {
            if (!map.containsKey(key) || map.get(key) == 0) {
                answer = "NO";
                break;
            }

            map.put(key, map.get(key) - 1);

        }

        System.out.print(answer);
    }

}
