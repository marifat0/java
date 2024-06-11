package com.api.smtp.enums;

public enum Constants {
    // SMTP
    EMAIL("mmarifatalhanif@gmail.com"),
    SUBJECT("Test email"),
    BODY("This is a test email"),
    ATTACHMENT_PATH("/home/hanif/attachment.txt"),

    // POCKET ACCOUNT
    PA_MAIN("PA Saving Main"),
    PA_SAVING("PA Saving"),
    PA_SPENDING("PA Saving Spending"),
    PA_TARGET("PA Saving Target");

    private String value;

    Constants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
