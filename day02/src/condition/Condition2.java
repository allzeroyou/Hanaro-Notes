package condition;

public class Condition2 {
    public static void main(String[] args) {
        int a = 1;
        switch (a) { // 조건문: 정수, 문자, 문자열 가능
            case 1:
                System.out.println("C");
            case 2:
                System.out.println("R");
            case 3:
                System.out.println("U");
            case 4:
                System.out.println("D");
                break; // break 안하면 default까지 실행됨.
            default:
                break;
        }
    }
}
