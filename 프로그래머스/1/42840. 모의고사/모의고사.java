import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] temp = {0, 0, 0};
        
        for (int i = 0; i < answers.length; i++) {
            
            if(student1[i % 5] == answers[i]) 
                temp[0] ++;
            if (student2[i % 8] == answers[i]) 
                temp[1] ++;
            if (student3[i % 10] == answers[i])
                temp[2] ++; 
        }
        
        int max = Arrays.stream(temp).max().getAsInt();
        
        for (int i = 0; i < 3; i++) {
            if(temp[i] == max) 
                answer.add(i+1); 
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();

    }
}