import java.util.stream.IntStream;

public class find_Kim2 {
    public static String solution(String[] seoul) {
        String answer = "";
        int index = IntStream.range(0, seoul.length)
                .filter(i -> "Kim".equals(seoul[i]))
                .findFirst()
                .orElse(-1);

        return "김서방은 "+index+"에 있다";
    }
    public static void main(String[] args) {
        String[] arr = {"Jane","Kim"};
        System.out.println(solution(arr));
    }
}
