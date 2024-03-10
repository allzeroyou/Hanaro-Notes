package array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int []a;
        a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(a)); // 그냥 출력된게 아님.
        // 함수 안에서 for문 돌리고 있는거

        int sum1 = 0; // 합
        for (int j : a) { // 0~9까지
            sum1 += j;
        }

        System.out.println("sum1: " + sum1);
        // for-each 구문
        for (int data : a) {
            System.out.println(data);
        }

    }
}
