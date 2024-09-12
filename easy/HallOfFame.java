import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HallOfFame {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            if(list.size()==k){
                if(list.get(list.size()-1) < score[i]){
                    list.remove(list.size()-1);
                    list.add(score[i]);
                }
            }else{
                list.add(score[i]);
            }
            list.sort(Collections.reverseOrder());
            answer[i] = list.get(list.size()-1);
        }
        return answer;
    }
    public static void main(String[] args) {
        HallOfFame hallOfFame = new HallOfFame();
        int[] answer = hallOfFame.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
        int[] answer2 = hallOfFame.solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000});
        System.out.println(Arrays.toString(answer));
        System.out.println(Arrays.toString(answer2));
    }
}
