package kata;
//각도기
//문제 설명
// 각에서 0도 초과 90도 미만은 예각, 90도는 직각,
// 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다.
// 각 angle이 매개변수로 주어질 때 예각일 때
// 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.
//예각 : 0 < angle < 90
//직각 : angle = 90
//둔각 : 90 < angle < 180
//평각 : angle = 180
public class S8 {
    public static void main(String[] args) {
        S8 s8 = new S8();
        System.out.println(s8.solution(90));
    }
    public int solution(int angle) {
        int answer = 0;
        if (angle > 0 && angle < 90) {
            answer = 1; // 예각
        } else if (angle == 90) {
            answer = 2; // 직각
        } else if (angle > 90 && angle < 180) {
            answer = 3; // 둔각
        } else if (angle == 180) {
            answer = 4; // 평각
        } else {
            answer = -1; // 잘못된 각도 입력
        }
        return answer;
    }

    //다른 풀이
    // 1)
//    public int solution(int angle) {
//        return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;
//    }

    // 2)
//    public int solution(int angle) {
//        int answer = 0;
//        String gak = null;
//        if(0 < angle && angle < 90){
//            gak = "예각";
//        };
//        if(angle == 90){
//            gak = "직각";
//        };
//        if(90 < angle && angle < 180){
//            gak = "둔각";
//        };
//        if(angle == 180){
//            gak = "평각";
//        };
//
//
//        switch(gak){
//            case "예각":
//                answer = 1;
//                break;
//            case "직각":
//                answer = 2;
//                break;
//            case "둔각":
//                answer = 3;
//                break;
//            case "평각":
//                answer = 4;
//                break;
//        }
//        return answer;
//    };
}
