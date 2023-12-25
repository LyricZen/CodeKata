package kata;
// 자연수 뒤집어 배열로 만들기
public class S17 {
    public static int[] solution(long n) {
        // n의 자릿수 계산
        int length = getLength(n);
        int[] answer = new int[length];

        // n을 자릿수 순서대로 배열에 저장
        // for (int i = length - 1; i >= 0; i--) {
        //     answer[i] = (int) (n % 10);
        //     n /= 10;
        // }

        // n을 뒤집어 배열에 저장
        for (int i = 0; i < length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }

        return answer;
    }

    // 자릿수 계산을 위한 보조 함수
    private static int getLength(long n) {
        int length = 0;
        while (n > 0) {
            n /= 10;
            length++;
        }
        return length;
    }
}
