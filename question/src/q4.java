import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        // 컴퓨터와 369
        // 컴퓨터가 먼저 숫자 출력-> 3, 6, 9 있으면 박수 대신 X 출력
        // 1~40 게임해서 게임 결과 출력
        // 만약 중간에 사용자가 숫자 잘못 입력시 컴퓨터 승~ 이라고 출력하고 게임종료

        // while문 -> 탈출 조건: 사용자가 틀렸을 때 or 마지막 수까지 도달했을 때
        int cnt = 1; // 탈출용 flag
        while (cnt <= 40) {
            System.out.println("컴퓨터: " + output(cnt++));
            System.out.print("나: ");
            Scanner s = new Scanner(System.in);
            String userInput = s.next(); // X일수도 있으니까 문자열로 입력받기.

            // 숫자 잘못 입력시 컴퓨터 승! ->컴퓨터 +1 한 숫자가 아니면 오류임.
            // 컴퓨터+1 한 결과물이 아니면(x일수도 있음) "컴퓨터 승!" 출력 후 종료
            String nextOutput = output(cnt);

            if (!userInput.equals(nextOutput)) {
                System.out.println("컴퓨터 승!");
                return; // 게임 종료(break는 while문만 종료시킴)
            }
            cnt++; // 다음차례: +2 해준다.
        }
        System.out.println("무승부!\n게임 종료!");
    }

    // 3,6,9에 맞는 문자열 출력
    private static String output(int num) {
        // 33은 어캐 처리?
        // 13 16 19 23 26 29 30 33
        // 문자열을 한 자릿수씩 잘라서 배열로 만들어서 0,1번째 자릿수에 3,6,9 있으면 x 출력
        String numStr = Integer.toString(num); // 문자열로 변환
        String outputStr = "";
        // 3,6,9일때만 for문 들어가도록
        if (numStr.contains("3") || numStr.contains("6") || numStr.contains("9")) {
            for (int j = 0; j < numStr.length(); j++) {
                char digit = numStr.charAt(j); // 한 자릿수씩 살핀다
                if (digit == '3' || digit == '6' || digit == '9') {
                    outputStr += "X";
                }
            }
        } else { // 3,6,9 아닌 숫자이면
            outputStr = numStr;
        }
        return outputStr;
    }

}

