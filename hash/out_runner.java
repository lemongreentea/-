import java.util.HashSet;

/*
문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
*/
public class out_runner {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = { "kiki", "eden"};
        String result = outRunner(participant,completion);
        System.out.println("완주 실패자"+result);
    }
    public static String outRunner(String[] participant, String[] completion){
        HashSet<String> nameList = new HashSet<>();
        String out_name;

        for (String name : participant) {
            nameList.add(name);
        }

        for (String name : completion) {
            nameList.remove(name);
        }

        out_name = nameList.toString();

        return out_name;
    }
}