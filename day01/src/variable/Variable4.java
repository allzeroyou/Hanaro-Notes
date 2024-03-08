package variable;

import java.util.Arrays;

public class Variable4 {
    public static void main(String[] args) {
        String str = "jmlee@tonesol.com";
        // id와 domain 출력
        String id = "";
        String domain = "";

//        String[] arr = str.split("@");
//        id = arr[0];

        id = str.substring(0, str.indexOf('@'));
        domain = str.substring(str.indexOf('@') + 1, str.indexOf('.'));


        System.out.printf("%s, %s", id, domain);
    }
}
