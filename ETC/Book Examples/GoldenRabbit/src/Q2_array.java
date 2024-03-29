import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2_array {
    public static Integer[] solution(Integer[] arr) {

        HashSet<Integer> tempArr = new HashSet<>(Arrays.asList(arr));

        //Integer[] result = Arrays.stream(arr).distinct().toArray(Integer[]::new);
        Integer[] answer = tempArr.toArray(new Integer[0]);
        Arrays.sort(answer, Collections.reverseOrder());

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer[] arr = new Integer[st.countTokens()];

        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long start = System.currentTimeMillis();
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(System.currentTimeMillis()-start);

    }
}
