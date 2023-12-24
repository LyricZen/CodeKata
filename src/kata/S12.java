package kata;
//평균 구하기
public class S12 {
    public double solution(int[] arr) {
        double answer = 0;
        //정수 int를 담고있는 배열[]의 평균 /n(arr.length) 을 리턴한다..
        int sum = 0;

        for (int number : arr) {
            //arr에 담긴 숫자들의 합
            sum += number;
        }
        answer = (double)sum / arr.length; //오타있었음 ㅠㅠ
        return answer;
    }
}
