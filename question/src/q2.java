import java.util.Arrays;
import java.util.Random;

public class q2 {
    public static void main(String[] args) {
        // 로또 번호 발생기
        // 1~45까지의 6개 랜덤번호 발생, 출력
        // 만약 6개 중에서 중복이 생기면 재추첨.
        // Math.random() 함수나 Random 클래스의 nextInt() 함수를 사용
        // 랜덤한 수를 발생시킨다.
        Random random = new Random();
        // 로또번호 저장
        int[] lotto = new int[6];
        int cnt = 0;

        while (cnt < 6) {
            int num = random.nextInt(45) + 1; // 1~45까지 랜덤수 발생
            for (int i : lotto) {
                if (!(i == num)) {
                    lotto[cnt] = num;
                    cnt++;
                    System.out.print(num + " ");
                    break; // break 해줘야 다시 랜덤수 뽑는다
                } else {
                    System.out.print(num + "(중복발생! 재추첨) ");
                    break;
                }
            }
        }
    }
}
