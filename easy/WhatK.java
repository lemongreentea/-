import java.util.Arrays;

public class WhatK {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int count = 0;
        for (int[] command : commands) {
           int[] tmpArr = Arrays.copyOfRange(array, command[0]-1, command[1]);
           Arrays.sort(tmpArr);
           answer[count++] = tmpArr[command[2]-1];
        }
        return answer;
    }
    public static void main(String[] args) {
        WhatK k = new WhatK();
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] com = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(k.solution(arr,com)));
    }
}
