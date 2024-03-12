package bank;

public class Account {
    private String accNum;
    private String custName;
    private long balance;
    private double interest;

    // 계좌 개수
    public static int count = 0;

    // static area는 언제 호출될까?
    static {
        System.out.println("Start static area....");
        count = 1000000;
        System.out.println("End static area....");
    }

    // 기본 생성자
    public Account() {
    }

    public Account(String accNum, String custName, long balance, double interest) {
        this.accNum = String.valueOf(count); // int->String
        this.custName = custName;
        if (balance < 0) {
            System.out.println("잔액은 0 이상이어야 해요.");
            return; // 더 이상 진행하지 말아라
        }
        this.balance = balance;
        this.interest = interest;
        count ++;
    }

    public String getAccNum() {
        return accNum;
    }

    public String getCustName() {
        return custName;
    }

    public long getBalance() {
        return balance;
    }

    public double getInterest() {
        return interest;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("accNum='").append(accNum).append('\'');
        sb.append(", custName='").append(custName).append('\'');
        sb.append(", balance=").append(balance);
        sb.append(", interest=").append(interest);
        sb.append('}');
        return sb.toString();
    }

    //    void withdraw(money){
//
//    }
    public void deposit(long money) {
        // 입금은 1원 이상이어야 함
        if (money <= 0) {
            return; // Exception...
        }
        this.balance += money;
        // 삼항연산자로 가능
        // return (money)>0 ? this.balance += money : 0
    }

    public void withdraw(long money) {
        if (money <= 0 || this.balance < money) { // 출금할 금액이 더 적다면
            return; // 종료시킴.
        }
        this.balance -= money;
    }

    public double getCalInterest() {
        return (this.balance * this.interest) / 100;
    }

    public int getCalInterest(int month) {
        return (int) (this.getCalInterest());
        // return (int) this() <-- 불가! 생성자에서만 호출 가능
        // return (int) ((this.balance * this.interest) / 100);
    }
}
