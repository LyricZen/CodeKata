package kata;

import java.util.Arrays;

public class S20 {

    public class Solution {
        public long solution(long n) {
            // long 타입을 문자열로 변환하여 각 자릿수를 char 배열에 저장
            char[] digits = Long.toString(n).toCharArray();

            // 각 자릿수를 큰 순서대로 정렬
            Arrays.sort(digits);

            // 정렬된 자릿수를 뒤집어서 문자열로 합쳐서 long 타입으로 변환
            long answer = Long.parseLong(new StringBuilder(new String(digits)).reverse().toString());

            return answer;
        }
    }
}
