package array;

public class Array6 {
    public static void main(String[] args) {
        int[][] a;
        a = new int[][]{{1, 2, 3}, {4, 5, 6}};
        System.out.println(a.length); // 2행
        System.out.println(a[0].length); // 3열
        // System.out.println(a[1][2].length);
        // Cannot access member because 'a[1][2]' has primitive type int

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("[%d][%d]: %d", i, j, a[i][j]);
                System.out.println();
            }
        }
        for (int[] ar : a) { // 각각의 배열에 접근
            for (int num : ar) { // 원소에 접근
                System.out.println(num + " ");
            }
        }
    }
}
