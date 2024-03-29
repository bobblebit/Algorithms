import java.io.*;
import java.util.*;

public class Q1_array {

    public static int[] solution(int[] arr) {

        Arrays.sort(arr);

        return arr;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[st.countTokens()];

        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long start = System.currentTimeMillis();
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(System.currentTimeMillis() - start);

    }
}
