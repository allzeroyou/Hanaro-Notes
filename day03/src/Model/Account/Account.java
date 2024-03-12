package Model.Account;

import Model.Condition;
import Model.Interest.Interest;

/**
 * 
 */
public abstract class Account {

    private String accNum;
    private String custName;
    private long balance;
    private Interest interest;
    private Condition condition;

    public Account(String accNum, String custName, long balance, Interest interest, Condition condition) {
        this.accNum = accNum;
        this.custName = custName;
        this.balance = balance;
        this.interest = interest;
        this.condition = condition;
    }

    public void applyInterest() {
        interest.apply(this);
    }
    public void withdraw(long money) {
        if(balance < money) {
            return;
        }
        balance -= money;
    }

    public void deposit(long money) {
        if(money < 0) {
            return;
        }
        balance += money;
    }

    public int getMonth() {
        return condition.getMonth();
    }

    public long lookBalance() {
        return this.balance;
    }

}