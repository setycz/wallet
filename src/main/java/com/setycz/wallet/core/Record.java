package com.setycz.wallet.core;

import java.util.Currency;

public class Record {
    private final String account;
    private final Currency value;

    public Record(String account, Currency value) {
        this.account = account;
        this.value = value;
    }

    public String getAccount() {
        return account;
    }

    public Currency getValue() {
        return value;
    }
}
