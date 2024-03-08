// 제어문
package condition;

public class Condition1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Start ...");
        System.out.println("Connect...");

        if (a < 20) {
            // System.out.println("Disconnect...");
            // 위 코드는 위험: 소켓 프로그래밍에서 disconnect를 안하고 종료하면 파이프 연결된 상태로 유지됨
            System.out.println("End...");
            // 함수끝내기
            return;
        }

        System.out.println("Database Add Imple...");
        System.out.println("Disconnect...");
        System.out.println("End!");
    }
}
