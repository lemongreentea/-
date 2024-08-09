/*
문제 설명
어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.
예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.
문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다.
number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.

제한 조건
number는 2자리 이상, 1,000,000자리 이하인 숫자입니다.
k는 1 이상 number의 자릿수 미만인 자연수입니다.
*/
public class biggest_num {
    public static void main(String[] args) {
        System.out.println("가장 큰 수는 "+ biggest("15654",2));
    }

    public static String biggest(String number, int k) {
        StringBuilder sb = new StringBuilder();

        int len = number.length();
        int remain = len - k;  // 최종적으로 남겨야 할 숫자의 개수
        int start = 0;

        // 남겨야 할 숫자의 개수만큼 반복
        for (int i = 0; i < remain; i++) {
            char max = '0';
            // 현재 위치에서 가능한 범위 내에서 가장 큰 숫자 찾기
            for (int j = start; j <= k + i; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    start = j + 1;  // 가장 큰 숫자 다음 위치 저장
                }
            }
            sb.append(max);  // 찾은 가장 큰 숫자 추가
        }

        return sb.toString();
    }


}
