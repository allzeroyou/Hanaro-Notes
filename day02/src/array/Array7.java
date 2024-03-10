package array;

import java.util.Random;

public class Array7 {
    public static void main(String[] args) {
        // 5행 5열의 배열에
        // random하게 중복되지 않은 1~100까지의 수를 발생
        // 각 열에 최댓값의 합, 최솟값의 합 출력.

        int[][] arr;
        arr = new int[5][5];

        Random ran = new Random();
        // 합
        int maxSum = 0;
        int minSum = 0;

        // 중복되었는지 확인하는 배열
        boolean[] visited = new boolean[101];

        for (int i = 0; i < arr.length; i++) {
            // 최대, 최소
            int maxNum = Integer.MIN_VALUE;
            int minNum = Integer.MAX_VALUE;
            // System.out.println(Integer.compare(maxNum, minNum+1));
            // 제일 작은거 + 1 -> max 값이 될 수 있으니 스택 오버 플로우 조심!

            for (int j = 0; j < arr[i].length; j++) {
                // 중복되지 않게 어떻게 해야 좋을까 -> 배열 탐색법.
                while (true) {
                    // 1~100까지의 랜덤 수
                    int ranNum = ran.nextInt(100) + 1;

                    if (!visited[ranNum]) {
                        arr[j][i] = ranNum; // 각 열의 최소, 최대이므로 삽입 순서 주의(i,j)
                        visited[ranNum] = true;
                        break;
                    }
                }
                System.out.print(arr[j][i] + " ");
                // 각 열의 최댓값, 최솟값
                if (maxNum < arr[j][i]) {
                    maxNum = arr[j][i];
                }
                if (minNum > arr[j][i]) {
                    minNum = arr[j][i];
                }
            }
            System.out.println();
            System.out.println(maxNum);
            System.out.println(minNum);
            maxSum += maxNum;
            minSum += minNum;
        }


        System.out.println("최대: " + maxSum);
        System.out.println("최소: " + minSum);


    }
}
