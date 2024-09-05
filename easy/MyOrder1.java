import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyOrder1 {

    public static String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            System.out.println("" + strings[i].charAt(n) + strings[i]);
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(arr);

        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] strings2 = {"abce", "abcd", "cdx"};
        int n2 = 2;
        System.out.println(Arrays.toString(MyOrder1.solution(strings2, n2)));
    }

}
