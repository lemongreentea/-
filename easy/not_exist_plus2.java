import java.util.Arrays;

public class not_exist_plus2 {
    public static int solution(int[] numbers) {
        int answer = 0;

        answer = Arrays.stream(new int[]{0,1,2,3,4,5,6,7,8,9}).sum() - Arrays.stream(numbers).sum();

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {5,8,4,0,6,7,9};
        System.out.println(solution(numbers));
    }
}
