package kata;
// 나머지가 1이 되는 수 찾기

public class S15 {
    public int solution(int n) {
        int answer = 0;
        //n을 x로 나눈 나머지가 1..
        for (int x = 1; x <= n; ++x)// x가 1씩 커지면서 n과 같아질때까지
            if (n % x == 1) { //n의 나머지가 1일 때,
                //x의 최소값..을 어떻게 구할 수 있을까나?! //
                answer = x;
                break;
            }

        return answer;
    }
}
