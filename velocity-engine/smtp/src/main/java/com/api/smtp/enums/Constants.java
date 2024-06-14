package com.api.smtp.enums;

public enum Constants {
    // SMTP
    EMAIL("mmarifatalhanif@gmail.com"),
    SUBJECT("Test email"),
    BODY("This is a test email"),
    ATTACHMENT_PATH("/home/hanif/attachment.txt"),

    // POCKET ACCOUNT
    PA_MAIN("PA Main"),
    PA_SAVING("PA Saving"),
    PA_SPENDING("PA Spending"),
    PA_TARGET("PA Target"),

    // POCKET TRANSACTION
    TRX_TYPE_DEPOSIT("Deposit"),
    TRX_TYPE_WITHDRAW("Withdraw"),
    TRX_TYPE_DEBIT("Debit"),
    TRX_TYPE_CREDIT("Credit"),
    TRX_TYPE_TRANSFER("Transfer");
    

    private String value;

    Constants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
