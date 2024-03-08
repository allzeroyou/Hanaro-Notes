package variable;

public class Variable5 {
    public static void main(String[] args) {
        String str = "abcdefg";
        // 역순으로 char를 대문자로 출력
        char[] chars = str.toUpperCase().toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }

    }
}
