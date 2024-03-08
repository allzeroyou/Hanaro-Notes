package loop;

public class Loop2 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("----------------------");

        // while문으로 변경
        int j = 0; // while문은 반복자가 구문 밖에 있기 때문에 활용 가능.
        int sum2 = 0;

        while (j < 10) {
            j++;
            sum2 += j;
        }
        System.out.println(sum2);
    }
}
