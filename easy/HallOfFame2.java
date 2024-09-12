import java.util.Arrays;
import java.util.PriorityQueue;

public class HallOfFame2 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i = 0; i < score.length; i++) {

            priorityQueue.add(score[i]);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }

            answer[i] = priorityQueue.peek();
        }



        return answer;
    }
    public static void main(String[] args) {
        HallOfFame2 hallOfFame = new HallOfFame2();
        int[] answer = hallOfFame.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
        int[] answer2 = hallOfFame.solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000});
        System.out.println(Arrays.toString(answer));
        System.out.println(Arrays.toString(answer2));
    }
}
