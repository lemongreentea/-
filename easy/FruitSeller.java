import java.util.*;
import java.util.stream.Collectors;

public class FruitSeller {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Queue<Integer> fruit = new PriorityQueue<>(Comparator.reverseOrder());
        fruit.addAll(Arrays.stream(score).boxed().collect(Collectors.toList())); //이 부분 집중

        while(fruit.size() >= m){
            int tmp = 0;

            for(int i=0; i<m ;i++){
                tmp = fruit.poll();
            }
           answer += tmp * m;
        }

        return answer;
    }
    public static void main(String[] args) {
        FruitSeller fs = new FruitSeller();
        System.out.println(fs.solution(4, 3, new int[] {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
       // System.out.println(fs.solution(3	, 4, new int[] {1, 2, 3, 1, 2, 3, 1}));
    }
}
