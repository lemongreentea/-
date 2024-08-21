import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class sort_reverse2 {
    public static Long solution(long n) {
        String answer = Arrays.stream(String.valueOf(n).split(""))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining());

        return Long.parseLong(answer);
    }
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
