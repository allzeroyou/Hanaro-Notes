package bankapp;

import bank.Account;

public class BankApp {
    public static void main(String[] args) {
        // 마이너스 통장이 아닌 이상 잔액에는 마이너스 값 불가!
        System.out.println(Account.count); // static 변수: 0

        Account acc1 = new Account("", "홍길동", 100L, 2.3);
        Account acc2 = new Account("", "홍길동", 100L, 2.3);
        Account acc3 = new Account("", "홍길동", 100L, 2.3);
        Account acc4 = new Account("", "홍길동", 100L, 2.3);
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        System.out.println(acc4);
//        System.out.println(acc1);
//        acc1.deposit(-100L);
//        System.out.println(acc1);
//        acc1.withdraw(1000000L);
//        System.out.println(acc1);
//        System.out.println(acc1.getCalInterest());
//        System.out.println(acc1.getCalInterest(12));
//        System.out.println(Account.count); // static 변수: 계좌 수만큼 증가.
//        System.out.println(Math.PI);

    }
}
