import java.util.Arrays;

public class SameWordClose {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char now = s.charAt(i);
            int sl = s.substring(0,i).indexOf(now)==-1 ? -1 : i-s.substring(0,i).lastIndexOf(now);
            /*int sr = s.substring(i+1).indexOf(now)+1;
            if(sl==-1){
                answer[i]=-1;
            }else if(sr==0){
                answer[i]=sl;
            }else{
                answer[i] = Math.min(sr, sl);
            }*/
            answer[i] = sl;
        }
        return answer;
    }
    public static void main(String[] args) {
        SameWordClose samewordclose = new SameWordClose();
        System.out.println(Arrays.toString(samewordclose.solution("banana")));
        System.out.println(Arrays.toString(samewordclose.solution("foobar")));
    }
}
