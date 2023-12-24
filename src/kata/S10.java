package kata;
//배열의 평균값

import java.util.Arrays;

public class S10 {
    public double solution(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }

    // 다른 풀이
//    // 1) Arrays.stream
//    public double solution(int[] numbers) {
//        return Arrays.stream(numbers).average().orElse(0);
//    }
//
//    // 2) for문
//    public double solution(int[] numbers) {
//        double answer = 0;
//        int sum = 0;
//        for(int i=0; i<numbers.length; i++){
//            sum += numbers[i];
//        }
//        answer = (double)sum / numbers.length;
//        return answer;
//    }
//
//    // 3) 합계와 평균 구한 후 answer
//    public double solution(int[] numbers) {
//        double answer = 0;
//        for(int i = 0; i < numbers.length; i++) {
//            answer += numbers[i];
//        }
//
//        answer /= numbers.length;
//        return answer;
//    }
}
