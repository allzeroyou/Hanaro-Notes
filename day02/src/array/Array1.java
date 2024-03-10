package array;

public class Array1 {
    public static void main(String[] args) {
        // 1.
        int a[];
        // a = new int[10]; // 사이즈를 10으로 정한다. 값으로 default 값이 들어감.(int형: 0)
        a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[3] = 10;
        // 2, 4번째는 기본값인 0이 들어감.
        System.out.println(a[2]);

        // 2.
        int[] b;
        b = new int[]{1, 2, 3, 4, 5};
        // 3.
        int c[] = {1, 2, 3, 4, 5};

        String str[] = {"A", "B", "C"}; // String pool에 저장되고, 그걸 가리키는 배열이 heap에 저장되고, 그걸 가리키는 배열이 stack에 저장됨.

    }
}
