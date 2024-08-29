public class Minimum_rectangle {
    public static int solution(int[][] sizes) {
        int maxW = 0; // 최대 가로 길이
        int maxH = 0; // 최대 세로 길이

        for (int[] size : sizes) {
            int w = size[0];
            int h = size[1];

            // 명함을 회전시켜 가로 길이가 세로 길이보다 항상 크거나 같게 만듦
            int maxSide = Math.max(w, h);
            int minSide = Math.min(w, h);

            // 최대 가로 길이와 최대 세로 길이 업데이트
            maxW = Math.max(maxW, maxSide);
            maxH = Math.max(maxH, minSide);
        }

        // 계산된 최대 가로 길이와 최대 세로 길이의 곱을 반환
        return maxW * maxH;
    }
    public static void main(String[] args) {
        int[][] arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(Test4.solution(arr));
    }
}
