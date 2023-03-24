import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();
        int len = str2.length();

        int answer = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char key : str2.toCharArray()) {
            map2.put(key, map2.getOrDefault(key, 0) + 1);
        }

        for (int i = 0; i < len - 1; i++) {
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int rt = len - 1; rt < str1.length(); rt++) {
            map1.put(str1.charAt(rt), map1.getOrDefault(str1.charAt(rt), 0) + 1);
            if (map1.equals(map2))
                answer++;
            map1.put(str1.charAt(lt), map1.get(str1.charAt(lt)) - 1);
            if (map1.get(str1.charAt(lt)) == 0)
                map1.remove(str1.charAt(lt));
            lt++;
        }

        System.out.println(answer);
    }
}