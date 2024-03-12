import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // 월, 수, 금, 일이라면 oh my god~ 출력
        // 아니면 enjoy! 출력
        Scanner s = new Scanner(System.in);
        int dayNum = s.nextInt();

        if (dayNum % 2 != 0) {
            System.out.println("oh my god~");
        } else {
            System.out.println("enjoy!");
        }
    }
}
