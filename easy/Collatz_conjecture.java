public class Collatz_conjecture {
    public static int solution(int num) {
        int count = 0;
        while (num != 1){
            if(count >= 500) {
                return -1;
            }else if(num % 2 == 1){
                num = num*3+1;
            } else if (num % 2 ==0 ) {
                num/=2;
            }
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(solution(626331));
    }
}
