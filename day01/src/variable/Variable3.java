package variable;

public class Variable3 {
    public static void main(String[] args) {
        int a = 10;
        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = "abc";
        String str4 = new String("abc");

        if (str1 == str3) {
            System.out.println("OK");
        }
        if (str1.equals(str2)) {
            System.out.println("OK2");
        }
        str1 = "10";
        str3 = "ab";

        int result = Integer.parseInt(str1) + 1;
        System.out.println(result);

        int num = 100;
        String result2 = num + "";
    }
}
