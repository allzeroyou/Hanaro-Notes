package Model.Account;

import Model.Condition;
import Model.Interest.Interest;

/**
 * 
 */
public class SubscriptionAccount extends Account {

    public SubscriptionAccount(String accNum, String custName, long balance, Interest interest, Condition condition) {
        super(accNum, custName, balance, interest, condition);
    }


}