package com.api.smtp.enums;

public enum Constants {
    EMAIL("mmarifatalhanif@gmail.com"),
    SUBJECT("Test email"),
    BODY("This is a test email"),
    ATTACHMENT_PATH("/home/hanif/attachment.txt");



    private String value;

    Constants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
