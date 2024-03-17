import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class q8 {
  public static void main(String[] args) {
    // 오름차순 정렬
    Scanner sc = new Scanner(System.in);

    String[] input = sc.nextLine().split(" "); // 띄어쓰기 기준으로 자르기

    // 배열 첫번째 요소는 학생수, 두번째 요소는 한 줄에 앉을 수 있는 학생 수
    int lineNum = Integer.parseInt(input[1]);
    // 오름차순 정렬
    Arrays.sort(input);
    // 한 줄에 앉은 학생수 카운트
    int cnt = 0;
//    for(int i =0; i<input.length;i++){
//      System.out.print(input[i]+ " ");
//    }

    for (int i = 0; i < input.length - 2; i++) { // 마지막 2개요소는 제외
      System.out.print(input[i] + " ");
      cnt++;
      if (cnt == lineNum) {
        System.out.println();
      }
    }
  }
}
