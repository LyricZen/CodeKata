package kata;
// 짝수와 홀수
public class S11 {
    public String solution(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }

        return answer;
    }

//    //다른 풀이
//    // 1) 삼항 연산자
//    String evenOrOdd(int num) {
//        return (num % 2 == 0) ? "Even" : "Odd";
//    }
}

