package com.api.smtp.model;


public class MyCustomException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public MyCustomException(String message) {
        super(message);
    }

    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyCustomException(Throwable cause) {
        super(cause);
    }

}
