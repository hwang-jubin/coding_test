import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : str.toCharArray()) {
            // key에 해당하는 value를 가져와서 +1 더해줌
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        // key 전부 가져옴
        char answer = 0;
        int max = Integer.MIN_VALUE;

        for (char key : map.keySet()) {

            if (max < map.get(key)) {
                max = map.get(key);
                answer = key;
            }

        }

        System.out.print(answer);
    }

}
