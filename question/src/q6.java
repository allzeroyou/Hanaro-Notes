import java.util.Scanner;

public class q6 {
  public static void main(String[] args) {
    // 별 찍기
    // n 입력받으면 삼각형 출력
    // n은 반드시 홀수임
    // 3~99까지 홀수 중 하나 입력
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int row = (n + 1) / 2; // 행 수
    for (int i = 1; i <= row; i++) {
      for (int j = i; j <= n / 2; j++) {
        System.out.print(" "); // 띄어쓰기
      }
      // 별은 1,3,5,7 순으로 증가(홀수)
      for (int k = 1; k <= i * 2 - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

