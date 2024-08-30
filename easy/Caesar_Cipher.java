public class Caesar_Cipher {
    public static String solution(String s, int n) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c>='A' && c<='Z') {
                char shifted = (char)((c-'A'+n)%26 + 'A');
                result.append(shifted);
            } else if(c>='a' && c<='z') {
                char shifted = (char)((c-'a'+n)%26 + 'a');
                result.append(shifted);
            }else{
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(Caesar_Cipher.solution("a",1));
    }
}
