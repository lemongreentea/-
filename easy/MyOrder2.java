import java.util.Arrays;

public class MyOrder2 {
    public static String[] solution(String[] strings, int n) {
        // Arrays.sort 메서드를 이용하여 정렬
        Arrays.sort(strings, (s1, s2) -> {
            // n번째 문자를 비교
            if (s1.charAt(n) == s2.charAt(n)) {
                // n번째 문자가 같으면 사전순으로 비교
                return s1.compareTo(s2);
            } else {
                // n번째 문자를 기준으로 비교
                return Character.compare(s1.charAt(n), s2.charAt(n));
            }
        });
        return strings;
    }

    public static void main(String[] args) {
        // 예시 입력
        String[] strings1 = {"sun", "bed", "car"};
        int n1 = 1;
        System.out.println(Arrays.toString(solution(strings1, n1))); // [car, bed, sun]

        String[] strings2 = {"abce", "abcd", "cdx"};
        int n2 = 2;
        System.out.println(Arrays.toString(solution(strings2, n2))); // [abcd, abce, cdx]
    }
}
