package Model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Condition {

    private LocalDateTime createAt;
    private LocalDateTime expiration;
    private long contractAmount;

    public Condition(LocalDateTime createAt, LocalDateTime expiration, long contractAmount) {
        this.createAt = createAt;
        this.expiration = expiration;
        this.contractAmount = contractAmount;
    }

    public boolean isExpired() {
        return LocalDateTime.now().isAfter(expiration);
    }

    public boolean isValidAmount(long money) {
        return money < contractAmount;
    }

    public int getMonth() {
        return (int) ChronoUnit.MONTHS.between(createAt, expiration);
    }
}