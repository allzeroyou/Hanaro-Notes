import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        // 컴퓨터와 369
        // 컴퓨터가 먼저 숫자 출력-> 3, 6, 9 있으면 박수 대신 X 출력
        // 1~40 게임해서 게임 결과 출력
        // 만약 중간에 사용자가 숫자 잘못 입력시 컴퓨터 승~ 이라고 출력하고 게임종료

        for (int i = 1; i < 41; i++) {
            System.out.print("컴퓨터: ");
            // 33은 어캐 처리?
            // 13 16 19 23 26 29 30 33
            // 문자열을 한 자릿수씩 잘라서 배열로 만들어서 0,1번째 자릿수에 3,6,9 있으면 x 출력
            String computerOutput = output(i);
            System.out.println(computerOutput);

            System.out.print("나: ");

            Scanner s = new Scanner(System.in);
            String userInput = s.next(); // X일수도 있으니까 문자열로 입력받기.

            // 숫자 잘못 입력시 컴퓨터 승! ->컴퓨터 +1 한 숫자가 아니면 오류임.
            // 컴퓨터+1 한 결과물이 아니면(x일수도 있음) "컴퓨터 승!" 출력 후 종료
            int nxtNum = i + 1;
            String nextOutput = output(nxtNum);

            if (!userInput.equals(nextOutput)) {
                System.out.println("컴퓨터 승!");
                return; // 게임 종료
            }
        }
        System.out.println("게임 종료!");
    }

    // 3,6,9에 맞는 문자열 출력
    private static String output(int num) {
        // 33은 어캐 처리?
        // 13 16 19 23 26 29 30 33
        // 문자열을 한 자릿수씩 잘라서 배열로 만들어서 0,1번째 자릿수에 3,6,9 있으면 x 출력
        String numStr = String.valueOf(num); // 문자열로 변환
        StringBuilder outputStr = new StringBuilder();

        for (int j = 0; j < numStr.length(); j++) {
            char digit = numStr.charAt(j); // 한 자릿수씩 살핀다
            if (digit == '3' || digit == '6' || digit == '9') {
                outputStr.append("X");
            } else {
                outputStr.append(digit);
            }
        }
        return outputStr.toString();
    }

}

