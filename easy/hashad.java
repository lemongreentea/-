public class hashad {
    public static boolean solution(int x) {
        boolean answer = true;
        String[] ns = String.valueOf(x).split("");
        int tmp = 0;
        for(int i = 0; i < ns.length; i++){
            tmp+=Integer.parseInt(ns[i]);
        }
        if(x%tmp==0){
            answer = true;
        }else {
            answer = false;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(13));
    }
}
