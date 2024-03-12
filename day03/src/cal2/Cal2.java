package cal2;

// 기능 중심의 클래스
public class Cal2 {
    static double PI = 3.14;

    public static double sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double div(int num1, int num2) {
        return num1 * (1.0) / num2;
    }
    public static double getCircleArea(int r){
        return r*r*PI;
    }
}
