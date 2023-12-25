package kata;
// 몫 구하기
public class S3 {
    public int solution(int num1, int num2) {
        int answer = num1 / num2;
        return answer;
    }

    //다른 풀이
    // 1)
//    public int solution(int num1, int num2) {
//        boolean val = (0<num1 && num1 <=100 && 0< num2 && num2 <=100);
//        int answer = 0;
//
//        if(val){
//            answer = num1/num2;
//        }else{
//            answer = -1;
//        }
//        return answer;
//    }
}
