import java.util.*;

//중복확인-hash
public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = kb.nextInt();

        // 오름차순
        Arrays.sort(arr);

        int answer = 0;
        int rt = n - 1;
        int lt = 0;
        int mid = (rt + lt) / 2;

        while (arr[mid] != m) {
            mid = (rt + lt) / 2;
            if (arr[mid] > m) {
                rt = mid - 1;
            } else if (arr[mid] < m) {
                lt = mid + 1;
            }
        }
        answer = mid + 1;
        System.out.println(answer);
    }
}
