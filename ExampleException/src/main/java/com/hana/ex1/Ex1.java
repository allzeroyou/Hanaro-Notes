package com.hana.ex1;

// 여러가지 예외
public class Ex1 {
    public static void main(String[] args) {
        //
        int i = 10 / 2;
        System.out.println(i);
        String str = "1,000"; // 숫자인척하는 문자열(, 때문에)

        int num = 0;
        try {
            num = Integer.parseInt(str);
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("입력값이 이상합니다.");
            // e.printStackTrace(); // 오류났던 과정을 볼 수 있음.
        }

        int arr[] = {1, 2, 3};
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

    }

}
