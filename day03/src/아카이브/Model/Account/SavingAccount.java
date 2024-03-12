package Model.Account;

import Model.Condition;
import Model.Interest.Interest;

/**
 * 
 */
public class SavingAccount extends Account {

    public SavingAccount(String accNum, String custName, long balance, Interest interest, Condition condition) {
       super(accNum, custName, balance, interest, condition);
    }


}