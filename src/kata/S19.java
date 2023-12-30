package kata;

public class S19 {
    // class Solution {
//     public long solution(long n) {
//         long answer = 0;
//         return answer;
    class Solution {
        public long solution(long n) {
            long sqrt_n = (long) Math.sqrt(n);  // n의 제곱근을 계산하여 long으로 변환

            // n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴
            if (sqrt_n * sqrt_n == n) {
                return (sqrt_n + 1) * (sqrt_n + 1);
            } else {
                return -1;
            }
        }
    }
}
