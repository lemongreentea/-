import java.util.Arrays;

public class remove_smallest_number {
    public static int[] solution(int[] arr) {
        int[] answer ;

        if(arr.length == 1) return new int[]{-1};

        answer = Arrays.stream(arr).filter(e-> e!=Arrays.stream(arr).min().getAsInt()).toArray();

        return answer;
    }

    public static void main(String[] args) {
        // int[] numbers = {5,8,4,0,6,7,9};
        int[] numbers = {9};
        System.out.println(solution(numbers));
    }
}
