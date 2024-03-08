package loop;

public class Loop1 {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            if (i > 100) { // 만약 i>=100 이라면 99까지 찍히고 종료됨.
                break;
            }
            if(i%2 == 1){
                continue; // 짝수만 출력
            }
            System.out.println(i);
        }
    }
}
