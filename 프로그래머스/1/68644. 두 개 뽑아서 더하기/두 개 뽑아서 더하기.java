import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        TreeSet<Integer> answer = new TreeSet<Integer>();
        
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                
                answer.add(numbers[i] + numbers[j]);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}