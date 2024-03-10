package array;

import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
        // 2차원 배열 선언하는 3가지 형태
//        int a[][];
//        int []b[];
//        int [][]c;

        int[][] a = new int[10][10];
        int[][] b = new int[10][]; // 한 줄로 된 형태로 각 row에는 아무 배열이나 들어올 수 있음.
        b[1] = new int[3];
        b[0] = new int[5];

        //System.out.println(Arrays.toString(b));
        int[][][] c = new int[3][][];

        int a1[][] = new int[2][];
        // a1[0] = {1, 2, 3}; // 이거 안됨
        int a2[][] = new int[][]{{1, 2}, {3, 4}};

        a2[0] = new int[]{1, 2};
        a2[1] = new int[]{2, 3};


    }
}
