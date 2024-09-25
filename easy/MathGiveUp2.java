import java.util.*;

public class MathGiveUp2 {
    public int[] solution(int[] answers) {
        Queue<Integer> pattern1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        Queue<Integer> pattern2 = new LinkedList<>(Arrays.asList(2, 1, 2, 3, 2, 4, 2, 5));
        Queue<Integer> pattern3 = new LinkedList<>(Arrays.asList(3, 3, 1, 1, 2, 2, 4, 4, 5, 5));


        int[] scores = new int[3];


        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1.peek()) {
                scores[0]++;
            }
            if (answers[i] == pattern2.peek()) {
                scores[1]++;
            }
            if (answers[i] == pattern3.peek()) {
                scores[2]++;
            }


            pattern1.offer(pattern1.poll());
            pattern2.offer(pattern2.poll());
            pattern3.offer(pattern3.poll());
        }


        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));


        List<Integer> topScorers = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                topScorers.add(i + 1);
            }
        }

        return topScorers.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        MathGiveUp2 giveUp = new MathGiveUp2();
        int[] answer = giveUp.solution(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(answer));
    }
}
