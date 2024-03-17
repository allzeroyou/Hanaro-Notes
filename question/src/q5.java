import java.util.Random;

public class q5 {
  public static void main(String[] args) {
    // 텍스트 야구 게임

    // 아웃카운트가 3이 아닐때까지
    int outCnt = 0;
    // 타자 세기
    int hitter = 1;

    while (outCnt<3) {
      System.out.println(hitter + "번 타자");

      int StrikeCnt = 0; // 스트라이크 카운트
      int BallCnt = 0;  // 볼 카운트

      while (StrikeCnt < 3 && BallCnt < 4) {
        // 투수 공 던짐
        Random r = new Random();
        int pitcher = r.nextInt(2); // 0,1

        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }

        if (pitcher == 0) {
          System.out.println("스트라이크!");
          StrikeCnt++;
        } else {
          System.out.println("볼~");
          BallCnt++;
        }
      }
      if (BallCnt == 4) {
        System.out.println("1루 진루!");
      } else if (StrikeCnt == 3) {
        System.out.println("삼진 아웃!");
        // 아웃카운트 증가
        outCnt++;
      }
      hitter++;
    }
    System.out.println("게임 종료!");
  }
}
