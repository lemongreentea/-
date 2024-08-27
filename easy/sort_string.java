import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class sort_string {
    public static String solution(String s) {
        return Arrays.stream(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
}
