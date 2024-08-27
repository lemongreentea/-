public class not_exist_plus {
    public static int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < 10; i++) {
            answer += i;
        }
        for(int i=0; i<numbers.length; i++) {
            answer = answer - numbers[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {5,8,4,0,6,7,9};
        System.out.println(solution(numbers));
    }

}
