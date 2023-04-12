import java.util.*;

//장난꾸러기
public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr0 = new int[n];
        for (int i = 0; i < n; i++) {
            arr0[i] = kb.nextInt();
        }
        int[] arr = arr0.clone();

        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            int tmp = 0;
            // 가장 작은 값의 index를 찾기
            for (j = i + 1; j < n; j++) {
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }
            // 가장 작은 값의 index와 앞부분부터 정렬해나감
            tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr0[i] != arr[i])
                answer.add(i + 1);
        }

        for (int x : answer) {
            System.out.print(x + " ");
        }
    }
}