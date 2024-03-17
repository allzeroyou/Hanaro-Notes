import java.util.Random;
import java.util.Scanner;

public class q9 {
  public static void main(String[] args) {
    Random r = new Random();
    int ranNum = r.nextInt(1, 100) + 1;

    // 탈출 flag
    boolean Flag = true;

    while (Flag) {
      System.out.println("번호를 입력하세요.");
      Scanner sc = new Scanner(System.in);
      int userNum = sc.nextInt();
      if (userNum > ranNum) {
        System.out.println("번호가 정답보다 큽니다.");
      } else if (userNum < ranNum) {
        System.out.println("번호가 정답보다 작습니다.");
      } else {
        System.out.println("정답입니다.");
        Flag = false;
      }
    }
  }
}
