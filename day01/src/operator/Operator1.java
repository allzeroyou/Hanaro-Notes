package operator;

import com.sun.security.jgss.GSSUtil;

public class Operator1 {
    public static void main(String[] args) {
        long a = 10;
        long b = 10;
        long c = a / b;

        int i1 = 10;
        int i2 = 10;
        double i3 = (double) i1 / i2;
        System.out.println(i3);

        int result = i1++ + i2;
        System.out.printf("%d %d %d\n", result, i1, i2);

        int num = 0;
        if (3 > 5) {
            num = 6;
        } else {
            num = 9;
        }
        System.out.println(num);

        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        // 3 수의 최대값을 구하시오
        int n4 = 0;
        n4 = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);

        System.out.println(n4);


    }
}
