package loop;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // input

        out:
        while (true) {
            System.out.println("Input Command... (q,c,r,u,d");
            String cmd = sc.next(); // next?

            if (cmd.equals("q")) { // q는 단독 가능
                System.out.println("Bye...");
                sc.close(); //
                break;
            }
            switch (cmd) {
                case "c":
                    System.out.println("create");
                    break;
                case "r":
                    System.out.println("input id...");
                    String id = sc.next();
                    System.out.println("read " + id + " info...");
                    break out;

                // 시스템 리소스 반환
                // sc.close();
                // break out; // out scope 확장(switch가 아니라 while 범위임)
                case "u":
                    System.out.println("update");
                    break;
                case "d":
                    System.out.println("delete");
                    break;
                default: // crud가 아닌 걸 눌렀을때 작동되어야 함
                    System.out.println("Try Again");

            }
        }
        System.out.println("End..."); // unreachable statement
    }
}
