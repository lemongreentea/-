import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.stream.Collectors;

public class CardDec {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> queue = new ArrayDeque<>(Arrays.stream(cards1).collect(Collectors.toList()));
        Queue<String> queue2 = new ArrayDeque<>(Arrays.stream(cards2).collect(Collectors.toList()));
        Queue<String> goalQueue = new ArrayDeque<>(Arrays.stream(goal).collect(Collectors.toList()));

        while (!goalQueue.isEmpty()){
            String word = goalQueue.poll();

            if(!queue.isEmpty() && queue.peek().equals(word)){
                queue.poll();
            } else if (!queue2.isEmpty() && queue2.peek().equals(word)) {
                queue2.poll();
            }else{
                return "No";
            }
        }
        return "Yes";
    }
    public static void main(String[] args) {
        CardDec cardDec = new CardDec();
        String[] cards1={"i", "drink", "water"};
        String[] cards2={"want", "to"};
        String[] goal={"i", "want", "to", "drink", "water"};
        String answer =cardDec.solution(cards1, cards2, goal);

        String[] cards3={"i", "water", "drink"};
        String[] cards4={"want", "to"};
        String[] goal2={"i", "want", "to", "drink", "water"};
        String answer2 =cardDec.solution(cards3, cards4, goal2);

        System.out.println(answer);
        System.out.println(answer2);
    }
}
