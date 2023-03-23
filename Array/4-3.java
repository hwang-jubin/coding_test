import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        // rt 전껀 미리 hash 에 넣어놓기
        for (int i = 0; i < k - 1; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }

        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            // rt hash 에 넣기
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            // rt 넣은 데 까지가 k 개수라서 answer array에 add
            answer.add(map.size());
            // lt 옮기기 전에 lt 의 key의 value를 -1 해줌 -> lt 의 value 가 0 되었을 때는
            // 아예 hash 를 빼주어야 하기 때문에 count 가 필요함
            map.put(arr[lt], map.get(arr[lt]) - 1);
            // -1을 하고 보니 0 인 것은 4개의 개수 중에서 count 가 안되는 것이므로 삭제를 해주어야 함
            // 안그러면 size로 몇개의 종류가 있는지 모름(map.size 못함)
            if (map.get(arr[lt]) == 0)
                map.remove(arr[lt]);
            lt++;
        }

        for (int x : answer)
            System.out.print(x + " ");

    }

}