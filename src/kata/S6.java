package kata;
// 두 수의 합
public class S6 {
    public int solution(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }
    //다른 풀이
    // 1)
//    public int solution(int num1, int num2) {
//        boolean val = (-50000<= num1 && num1<= 50000 && -50000<=num2 && num2 <= 50000);
//        int answer = -1;
//        if(val){
//            answer = num1 + num2;
//        }
//        return answer;
//    }
}
