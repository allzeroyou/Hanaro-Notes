package array;

import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
        // 1~10까지 랜덤 한 숫자 뽑기
//        Random r = new Random();
//        int num = r.nextInt(10) + 1; // 1~10까지.
//        System.out.println(num);

        // int형 배열, 사이즈 10개
        // 배열에 1~100까지의 숫자를 random 하게 넣고
        // 합과 평균 구하시오.

        int[] arr;
        arr = new int[10];

        Random ran = new Random();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = ran.nextInt(100) + 1;
            for (int item : arr) {
                if (!(item == num)) {
                    arr[i] = num;
                } else {
                    num = ran.nextInt(100) + 1;
                    arr[i] = num;
                }
            }
            sum += arr[i];
        }
        int avg = sum / 10;
        System.out.println("합: " + sum);
        System.out.println("평균: " + avg);
    }
}
