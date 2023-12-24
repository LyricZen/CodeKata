package kata;

public class S8 {
    public static void main(String[] args) {
        S8 s8 = new S8();
        System.out.println(s8.solution(90));
    }
    public int solution(int angle) {
        if (angle > 0 && angle < 90) {
            return 1; // 예각
        } else if (angle == 90) {
            return 2; // 직각
        } else if (angle > 90 && angle < 180) {
            return 3; // 둔각
        } else if (angle == 180) {
            return 4; // 평각
        } else {
            return -1; // 잘못된 각도 입력
        }
    }
}
