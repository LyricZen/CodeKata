package kata;
// 나이 출력

import java.time.LocalDate;

public class S4 {
    public int solution(int age) {
        int x = 2022 - age;
        return x+1;
    }

    //다른 풀이
    // 1)
//    public int solution(int age) {
//        LocalDate today = LocalDate.now();
//        return today.getYear() - age + 1;
//    }
}
