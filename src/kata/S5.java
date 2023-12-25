package kata;
//숫자 비교하기
public class S5 {
    public int solution(int num1, int num2) {
        if (num1 == num2) {
            return 1;
        } else {
            return -1;
        }
    }
    //다른 풀이
    // 1)
//    public int solution(int num1, int num2) {
//        int answer = (num1 == num2) ? 1 : -1;
//        return answer;
//    }
    // 2)
//    public int solution(int num1, int num2) {
//        int answer = 0;
//
//        if(num1 == num2){
//            return 1;
//        }
//        if(num1 != num2){
//            return -1;
//        }
//        return answer;
//    }
}
