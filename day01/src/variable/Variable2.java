package variable;

import com.sun.security.jgss.GSSUtil;

public class Variable2 {
    public static void main(String[] args) {
        // 기본 타입
        // 정수
        int a= 10;
        byte a1 = 100;
        byte a2 = 100;
        byte a3 = (byte) (a1+a2);
        System.out.println(a3);

        long a5 = 2150000000L;

        long a6 = 1150000000 + 1150000000L; // 23억
        System.out.println(a6);

        String ch = "Ab"; // character
        System.out.println(ch);

        char ch2 = 65;
        System.out.println(ch2); // A 출력

        char ch3 = '\u0042';
        System.out.println(ch3);// B 출력

        char ch4 = 0xac00; // unicode 44032
        System.out.println(ch4); // 가

        // 실수
        double d = 10.0;
        float f = 10.0F;

        float f2 = (float) (10.1 + 10);
        System.out.println(f2);

        int test = (int) (5+4.5);
        System.out.println(test);

        // 논리
        boolean b = true;



    }
}
