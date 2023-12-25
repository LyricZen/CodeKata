package kata;
//자릿수 더하기
public class S13 {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }

//    //나의 풀이
//    public int solution(int n) {
//        int answer = 0;
//        //각 자리수
//        int x = n / 100;
//        int y = n % 100 / 10;
//        int z = n % 100 % 10;
//        answer = x + y + z;
//
//        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//        System.out.println(answer);
//
//        return answer;
//    }

//    //다른 풀이
//    // 1)
//    public int solution(int n) {
//        int answer = 0;
//
//        while(true){
//            answer+=n%10;
//            if(n<10)
//                break;
//            n=n/10;
//        }
//        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//        System.out.println("Hello Java");
//        return answer;
//    }
//
//    // 2)
//    public int solution(int n) {
//        int answer = 0;
//
//        while (n != 0) {
//            answer += n % 10;
//            n /= 10;
//        }
//
//        return answer;
//    }
//
//    // 3) 문자 배열 사용
//    public int solution(int n) {
//        int answer = 0;
//        String[] array = String.valueOf(n).split("");
//        for(String s : array){
//            answer += Integer.parseInt(s);
//        }
//        return answer;
//    }
}
