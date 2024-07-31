import java.util.Arrays;
/*
탐욕알고리즘의 시작
1. 문제정의
2. 탐욕 선택 속성 확인 (현재상태에서 최적의 선택이 항상 전체 문제의 최적해로 이어지는가)
3. 해 선택 (현재상태의 가장 최적인 해를 선택)
4. 최적성 증명 (선택한 탐욕알고리즘이 실제로 최적해를 제공하는지 증명)
5. 반복 수행 및 종료 조건 확인
*/
public class Coin_Change {

    public static void main(String[] args) {
        int[] coins = {25, 10, 5, 1};
        int amount = 63;
        int result = coinChange(coins, amount);
        System.out.println("동전 최소의 개수는 "+ result);
        // 25*2 , 10*1, 1*3 => 6개
    }

    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int count = 0;
        for (int i = coins.length - 1; i >=0 ; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                count++;
            }
        }
        return count;
    }

}