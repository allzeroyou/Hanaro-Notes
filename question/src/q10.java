import java.util.Scanner;

public class q10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    int openCnt = 0;
    int closeCnt = 0;
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (c == '(') {
        openCnt++;
      } else {
        closeCnt++;
      }
    }
    System.out.println(openCnt + " " + closeCnt);
  }
}
