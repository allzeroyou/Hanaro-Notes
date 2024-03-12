import Model.Account.Account;
import Model.Account.DepositAccount;
import Model.Condition;
import Model.Interest.DepositInterest;
import Model.Interest.Interest;
import Model.Interest.InterestType;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Account account = new DepositAccount("1000",
                "james",
                1000L,
                new DepositInterest(10, InterestType.SIMPLE),
                new Condition(LocalDateTime.now(), LocalDateTime.now().plusYears(1L), 200000L));
        System.out.println(account.lookBalance());
        account.applyInterest();
        System.out.println(account.lookBalance());
    }
}