package kata;
// 두 수의 곱
public class S2 {
    public int solution(int num1, int num2) {
        int x = num1 * num2;
        return x;
    }

    // 다른 풀이
    // 1)
//    public int solution(int num1, int num2) {
//        int answer = 0;
//        if(0<=num1 && 100>=num1 && 0<=num2 && 100>=num2){
//            answer = num1 * num2;
//        }
//        return answer;
//    }

    // 2)
//    public int solution(int num1, int num2) {
//        boolean val = (0<=num1 && num1 <=100 && 0<=num2 &&num2<=100);
//        int answer = 0;
//        if(val){
//            answer = num1 *num2;
//        }
//        return answer;
//    }
}
