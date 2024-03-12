package Model.Interest;

import Model.Account.Account;

/**
 *
 */
public abstract class Interest {
    double interest;

    InterestType interestType;

    public Interest(double interest, InterestType interestType) {
        this.interest = interest;
        this.interestType = interestType;
    }

    public void apply(Account account) {
        double interest = calInterest(account.lookBalance(), account.getMonth());
        account.deposit((long) interest);
    }

    protected double calInterest(long balance, int month) {
        if (interestType == InterestType.SIMPLE) {
            return balance * ((interest)/100 * month);
        }

        return balance * (1 + interest)/100 * month;
    }

}