public class FoodFight {
    public String solution(int[] food) {
        String answer = "";
        for (int i = 0; i < food.length; i++) {
            if (food[i] % 2==0) {
                for (int j = 0; j < food[i]/2 ; j++) {
                    answer += i;
                }
            }else if (food[i] % 2==1 && food[i] > 2) {
                for (int j = 0; j < (food[i]-1)/2 ; j++) {
                    answer += i;
                }
            }
        }

        String tmpAnswer = new StringBuilder(answer).reverse().toString();
        answer += "0";
        answer += tmpAnswer;

        return answer;
    }

    public static void main(String[] args) {
        FoodFight f = new FoodFight();
       // System.out.println(f.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(f.solution(new int[]{1, 3, 4, 6}));
        System.out.println(f.solution(new int[]{1, 7, 1, 2}));
    }
}
