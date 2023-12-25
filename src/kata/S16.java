package kata;
// x만큼 간격이 있는 n개의 숫자

public class S16 {
    public static int[] solution(int x, int n) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = x * (i + 1);
        }

        // 결과 배열 출력
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(answer[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        return answer;
    }
}
