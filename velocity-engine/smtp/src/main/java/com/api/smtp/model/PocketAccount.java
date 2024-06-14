package com.api.smtp.model;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class PocketAccount {

    private long ID;
    private String type;
    private String cif;
    private String accountNumber;
    private BigDecimal balance;
    private String currency;
    private String description;

    public PocketAccount() {
    }

    public PocketAccount(Long ID, String type, String accountNumber) {
        this.ID = ID;
        this.type = type;
        this.accountNumber = accountNumber;
    }

    public PocketAccount(Long ID, String type, String cif, String accountNumber, BigDecimal balance, String currency, String description) {
        this.ID = ID;
        this.type = type;
        this.cif = cif;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currency = currency;
        this.description = description;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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
