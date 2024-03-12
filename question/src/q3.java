import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        // 369 게임
        // 1~10까지 정수 하나 입력
        // 1부터 그 수까지 순서대로 공백을 두고 출력
        // 만약 3, 6, 9 중 하나라면 수 대신 영문 대문자 X 출력
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        for (int i = 1; i < num + 1; i++) {
            if (i == 3 || i == 6 || i == 9) {
                System.out.print("X" + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
