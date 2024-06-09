package com.api.smtp.model;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class PocketAccount {

    private String type;
    private BigDecimal balance;
    private String currency;
    private String description;

    public PocketAccount() {
    }

    public PocketAccount(String type, BigDecimal balance, String currency, String description) {
        this.type = type;
        this.balance = balance;
        this.currency = currency;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
