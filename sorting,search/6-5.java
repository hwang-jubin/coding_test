import java.util.*;

//중복확인-hash
public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        char answer = 'U';
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            if (map.containsKey(x)) {
                answer = 'D';
                break;
            } else
                map.put(x, map.getOrDefault(x, 0));
        }
        System.out.println(answer);
    }
}
