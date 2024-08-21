import java.util.Arrays;

public class sort_reverse {
    public static Long solution(long n) {
        long answer = 0;
        String[] ns = String.valueOf(n).split("");
        Arrays.sort(ns);
        String result = "";

        for (int i = ns.length-1 ; i >= 0; i--) {
            result += ns[i];
        }
        answer = Long.parseLong(result);
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
